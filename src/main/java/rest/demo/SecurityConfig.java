package rest.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig /* extends WebSecurityConfigurerAdapter */ {
	// @Bean
	// public UserDetailsService userDetailsService() {
	// 	UserDetails userDetails = User.withDefaultPasswordEncoder()
	// 		.username("a")
	// 		.password("a")
	// 		.roles("USER")
	// 		.build();
	// 	return new InMemoryUserDetailsManager(userDetails);
	// }

	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// 	http.authorizeRequests("/getA").permitAll()
	// 	.anyRequest().hasRole("admin")
	// 	.and()
	// 	.formLogin().permitAll()
	// 	.and()
	// 	.logout().permitAll();
	// }
	

}
