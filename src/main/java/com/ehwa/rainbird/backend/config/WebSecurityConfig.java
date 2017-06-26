//package com.ehwa.rainbird.backend.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.BeanIds;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.zielcrew.draftdna.backend.common.security.JwtAuthenticationTokenFilter;
//import com.zielcrew.draftdna.backend.common.security.RestAuthenticationEntryPoint;
//import com.zielcrew.draftdna.backend.restful.v1.user.UserService;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@Slf4j
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	private RestAuthenticationEntryPoint unauthorizedHandler;
//
//	@Autowired
//	private UserService userService;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
//				.antMatchers("/**").permitAll()
//				// // .antMatchers("/myymjm").hasAuthority("USER")
//				.antMatchers(HttpMethod.POST, "/v1/auth/login").permitAll()
//				.antMatchers(HttpMethod.GET, "/v1/auth/logout").permitAll()
//				.antMatchers(HttpMethod.OPTIONS, "/**")
//				.permitAll().and().logout().permitAll();
//		http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
//		http.headers().cacheControl();
//	}
//
//	@Autowired
//	public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) {
//		try {
//			authenticationManagerBuilder.authenticationProvider(authProvider());
//		} catch (Exception e) {
//			log.debug("ConfigrationException", e);
//		}
//	}
//
//	@Bean
//	public DaoAuthenticationProvider authProvider() {
//		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//		authProvider.setUserDetailsService(userService);
//		authProvider.setPasswordEncoder(passwordEncoder());
//		return authProvider;
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@Bean
//	public JwtAuthenticationTokenFilter authenticationTokenFilterBean() {
//		return new JwtAuthenticationTokenFilter();
//	}
//
//	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}
//}