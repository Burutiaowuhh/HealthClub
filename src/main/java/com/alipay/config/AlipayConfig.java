package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101500694941";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDJKUYIS6mDuTc/8PVw/246xN1P9Tr2baPRf3f2qSM2pHHhq3LM5tFN1/0DtLzgJ8yX6AVzi910fPkH7z0tVhoSvR2wF+SRGeGRzMRH9DuZn+RtcXw9eIcupAGytrXSFBYjU+UXymvxBVqyOzpg79lWU1LwhI/qll3wfZdrbfvizacd5H7YaTiFdzimttf5/y2Zjf81sE03JmERfYwbprbptc8zrm7hJ+2643sRnQUyj5ITKujhjm+y0KANaI3RSuBEXLy7HA4c5i6oSF4lWjGvedNQia651pCZN5/Ojnz5/3/hUihz6eojWd9ydzXiEzsbCNJzSNoYnThWSG9Y1DwfAgMBAAECggEADUpm0CF/n65bEiRvcvnNZKChJqlDLgjsa+kKGgfuxatzwr87JIKTjZsZomcMm5rFj7vKsGmrRgkDwxxxZE9uBZLtJTdO6K9XEfT/eumODoZb50c6OC2AcPpxCke8F5cwJ0Fhv4KmQxRhe6kiIEl4iJWUw0Ne5tbsefkySezIWaGyr/PeoQ4vgTW28WwCO/utX6/75aAnz9rWnSjCS+XlHT80a7OarS1Da7cvylLiT7DLupgYZtvtv95agya02hpBOvkroZXihrtmV3oQfb1akIBlDur1gTC+xmWVcqSZARYP77RkA06Wqzed82h1OIHyn4y18DTHEFfz9/+5/oTNoQKBgQD4Bv73LqYuZxJ2gN4be9BjL5/d+kh9IeKjXqa8/UU+OdFy6KBRNozCAkUxoQTBQBhbrcjzz4U5yrPKZ01PjP0oAzjzvb/w4BNaI86oMe0vvG8iDclB0j1SG8gjA6NcKfaNfeW9lnhj7xDOqTqhWNF0K0gNr0TD/G/TWNvY2iyg2QKBgQDPoJ5uL5Ebaw/3w4dnebHYDKxKwlHaQGKxhP9H7Q+0VUwy+N+fkkBSzWS7Gh4zARAE4zScVJaYaqYYIbfq2zydGpF7BYwdcAcmLD2k72om2a5AQmVaGEz6boPz+FJgcnC0j2QoMVyYqXL5Mdvv4d8YFQocVLSM/4CAize7m+6ptwKBgD5pLEEwuNpWT1wIY1tRFYfP1Q97SkBKhYgMajKGHKVi0SR0CttEubib76NkXBjwsvBm03keT+zR59nXkqmg1Zb68JrMtX68M8Jr3jWOkpt/dAuCopDwgUOm//5njPTFDmheNLA3K8Yhwv3tsXYmLlZoCbJ/1vLmE5F/+5oelDpJAoGBAL/wYyXHcWSgZ8WLC1y8Io1wwcHmu9aAmPw0z+4FF/SEugmRCuGwSSiC2fEhpvNNsyphhBxVElbamKtMWIKTpAg0LHNG4I3CJ8nBMkeMUFyT9cNP3fQY7OjCS9e5IyYoBUrWGCgT4d77Ht+BmSm8bAoOQSeJotOJy5iJmr8j2tEnAoGAU2co4Yf9UN3gMpJj8MPpkAsusOS6AonPoQLQ6CDCXN92bhl2wYUrNNF9wcJkn/zkm2VHk9HaoiRrzFGvLmWDAmdxLL/LsSrDGFxbnsehIGKuo2FNVT4PXC/S3ky0Mi05l0S/xXiQxSGgVtniSQS/7udGA3S/Xr8KHqNv/xDu4qQ=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkh4GaimlYA8NZ1adOKjjJSimBNUMx2TQJcj1AWF2Q2uNNohNqYojUrcCx+MXbRv61AuLZcfwSIyrLhOeteg54Tz9s5ozZoH+D9Ib6U3IAylOFwOelkMYnxmN8G/G4xFyacv0WPK+N2ngC0Nrbb7S3hQjcussmBbG98GneRocJc+RMgQSro+Ljko6/S49KbSH7botGYmZRHojPuK18lo4Z0/dDyktAT4N7u9e3ktqAHPYT6yb6mNeU71YKrlrqJfEF8qCdJO0OujGU0UTx4mRXsuHAHHa5LRqwOzg4ttz9UbDgbvQLdbVnihR9nJFhte6mHhY8AGUf6DXssgJAZ7M8wIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8888/profile";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问

	public static String return_url = "http://localhost:8888/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

