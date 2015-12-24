package com.cherry.infrastructure.user.controller;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description: User控制器层 </p> 
 * <p>Author:chenyan/陈燕</p>
 */
//@Scope 用来指定Bean的作用域,可以取值
//singleton单例(只创建一次，所以在该类里不能有成员变量，要不然会有线程安全问题)，默认值
//prototype多例(每过来一个请求就创建一次，这种情况，成员变量是没有问题的，Controller里一般用这种方式)
//Spring2.0之后又加了三种session、request、global session专门用于Web应用程序上下文的Bean：
//session、request、global session
//http://www.cnblogs.com/qq78292959/p/3716827.html
@Scope("prototype")
//标明是被Spring管理的一个Bean，并且类型是@Controller
//@Service用于标注业务层组件，
//@Controller用于标注控制层组件（如struts中的action）,
//@Repository用于标注数据访问组件，即DAO组件，
//而@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。   
@Controller("UserController")//
@RequestMapping("/user")//请求路径映射
public class UserController{
	private static Logger logger = Logger.getLogger(UserController.class);
	
	/**
	 * <br/>Description:跳转到用户页面
	 * <p>Author:chenyan/陈燕</p>
	 * @return 页面地址
	 */
	@RequestMapping(value="/",method={RequestMethod.GET})
	public String gotoUserPage(){
		logger.info("加载用户页面");
		return "user/user";//返回响应路径
	}
}
