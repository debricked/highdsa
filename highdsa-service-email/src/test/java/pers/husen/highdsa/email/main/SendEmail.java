package pers.husen.highdsa.email.main;

import pers.husen.highdsa.service.email.SimpleHtmlEmailImpl;

/**
 * @Desc 发送邮件测试
 *
 * @Author 何明胜
 *
 * @Created at 2018年2月3日 下午5:20:50
 * 
 * @Version 1.0.1
 */
public class SendEmail {
	public static void main(String[] args) {
		SendEmail sendEmail = new SendEmail();

		sendEmail.sendEmail2Register("2796407738@qq.com", 123123);
		// sendEmail.sendEmail2Admin();
	}

	public boolean sendEmail2Register(String email, int randomCode) {
		String subject = "【何明胜的个人网站】新用户注册邮箱验证";
		String content = "欢迎在【何明胜的个人网站】注册账号.";

		return new SimpleHtmlEmailImpl().sendEmail2User(email, subject, content);
	}

	public void sendEmail2Admin() {
		String name = "何明胜";
		String email = "1123767053@qq.com";
		String phone = "18626422426";
		String content = "测试给管理员";

		new SimpleHtmlEmailImpl().sendEmail2Admin(name, email, phone, content);
	}
}