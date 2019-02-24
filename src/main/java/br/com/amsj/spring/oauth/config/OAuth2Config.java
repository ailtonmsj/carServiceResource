package br.com.amsj.spring.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

@Configuration
@EnableResourceServer
public class OAuth2Config extends ResourceServerConfigurerAdapter{
	
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/public/**", "/about").permitAll().anyRequest().authenticated();
    }
    
    @Autowired
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser("clark").password(encoder.encode("password")).roles("USER").and().
			withUser("bruce").password(encoder.encode("password")).roles("USER");
	}
    
    @Primary
    @Bean
    public RemoteTokenServices tokenService() {
    	
        RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setCheckTokenEndpointUrl("http://localhost:9091/oauth/check_token");
        tokenService.setClientId("carServiceClient");
        tokenService.setClientSecret("clientSecret");
        return tokenService;
    }
}
