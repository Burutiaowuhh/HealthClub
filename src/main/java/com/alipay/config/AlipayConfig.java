package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *������AlipayConfig
 *���ܣ�����������
 *��ϸ�������ʻ��й���Ϣ������·��
 *�޸����ڣ�2017-04-05
 *˵����
 *���´���ֻ��Ϊ�˷����̻����Զ��ṩ���������룬�̻����Ը����Լ���վ����Ҫ�����ռ����ĵ���д,����һ��Ҫʹ�øô��롣
 *�ô������ѧϰ���о�֧�����ӿ�ʹ�ã�ֻ���ṩһ���ο���
 */

public class AlipayConfig {
	
//�����������������������������������Ļ�����Ϣ������������������������������

	// Ӧ��ID,����APPID���տ��˺ż�������APPID��Ӧ֧�����˺�
	public static String app_id = "2016101500694941";
	
	// �̻�˽Կ������PKCS8��ʽRSA2˽Կ
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDJKUYIS6mDuTc/8PVw/246xN1P9Tr2baPRf3f2qSM2pHHhq3LM5tFN1/0DtLzgJ8yX6AVzi910fPkH7z0tVhoSvR2wF+SRGeGRzMRH9DuZn+RtcXw9eIcupAGytrXSFBYjU+UXymvxBVqyOzpg79lWU1LwhI/qll3wfZdrbfvizacd5H7YaTiFdzimttf5/y2Zjf81sE03JmERfYwbprbptc8zrm7hJ+2643sRnQUyj5ITKujhjm+y0KANaI3RSuBEXLy7HA4c5i6oSF4lWjGvedNQia651pCZN5/Ojnz5/3/hUihz6eojWd9ydzXiEzsbCNJzSNoYnThWSG9Y1DwfAgMBAAECggEADUpm0CF/n65bEiRvcvnNZKChJqlDLgjsa+kKGgfuxatzwr87JIKTjZsZomcMm5rFj7vKsGmrRgkDwxxxZE9uBZLtJTdO6K9XEfT/eumODoZb50c6OC2AcPpxCke8F5cwJ0Fhv4KmQxRhe6kiIEl4iJWUw0Ne5tbsefkySezIWaGyr/PeoQ4vgTW28WwCO/utX6/75aAnz9rWnSjCS+XlHT80a7OarS1Da7cvylLiT7DLupgYZtvtv95agya02hpBOvkroZXihrtmV3oQfb1akIBlDur1gTC+xmWVcqSZARYP77RkA06Wqzed82h1OIHyn4y18DTHEFfz9/+5/oTNoQKBgQD4Bv73LqYuZxJ2gN4be9BjL5/d+kh9IeKjXqa8/UU+OdFy6KBRNozCAkUxoQTBQBhbrcjzz4U5yrPKZ01PjP0oAzjzvb/w4BNaI86oMe0vvG8iDclB0j1SG8gjA6NcKfaNfeW9lnhj7xDOqTqhWNF0K0gNr0TD/G/TWNvY2iyg2QKBgQDPoJ5uL5Ebaw/3w4dnebHYDKxKwlHaQGKxhP9H7Q+0VUwy+N+fkkBSzWS7Gh4zARAE4zScVJaYaqYYIbfq2zydGpF7BYwdcAcmLD2k72om2a5AQmVaGEz6boPz+FJgcnC0j2QoMVyYqXL5Mdvv4d8YFQocVLSM/4CAize7m+6ptwKBgD5pLEEwuNpWT1wIY1tRFYfP1Q97SkBKhYgMajKGHKVi0SR0CttEubib76NkXBjwsvBm03keT+zR59nXkqmg1Zb68JrMtX68M8Jr3jWOkpt/dAuCopDwgUOm//5njPTFDmheNLA3K8Yhwv3tsXYmLlZoCbJ/1vLmE5F/+5oelDpJAoGBAL/wYyXHcWSgZ8WLC1y8Io1wwcHmu9aAmPw0z+4FF/SEugmRCuGwSSiC2fEhpvNNsyphhBxVElbamKtMWIKTpAg0LHNG4I3CJ8nBMkeMUFyT9cNP3fQY7OjCS9e5IyYoBUrWGCgT4d77Ht+BmSm8bAoOQSeJotOJy5iJmr8j2tEnAoGAU2co4Yf9UN3gMpJj8MPpkAsusOS6AonPoQLQ6CDCXN92bhl2wYUrNNF9wcJkn/zkm2VHk9HaoiRrzFGvLmWDAmdxLL/LsSrDGFxbnsehIGKuo2FNVT4PXC/S3ky0Mi05l0S/xXiQxSGgVtniSQS/7udGA3S/Xr8KHqNv/xDu4qQ=";
	
	// ֧������Կ,�鿴��ַ��https://openhome.alipay.com/platform/keyManage.htm ��ӦAPPID�µ�֧������Կ��
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkh4GaimlYA8NZ1adOKjjJSimBNUMx2TQJcj1AWF2Q2uNNohNqYojUrcCx+MXbRv61AuLZcfwSIyrLhOeteg54Tz9s5ozZoH+D9Ib6U3IAylOFwOelkMYnxmN8G/G4xFyacv0WPK+N2ngC0Nrbb7S3hQjcussmBbG98GneRocJc+RMgQSro+Ljko6/S49KbSH7botGYmZRHojPuK18lo4Z0/dDyktAT4N7u9e3ktqAHPYT6yb6mNeU71YKrlrqJfEF8qCdJO0OujGU0UTx4mRXsuHAHHa5LRqwOzg4ttz9UbDgbvQLdbVnihR9nJFhte6mHhY8AGUf6DXssgJAZ7M8wIDAQAB";

	// �������첽֪ͨҳ��·��  ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String notify_url = "http://localhost:8888/pay";

	// ҳ����תͬ��֪ͨҳ��·�� ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������

	public static String return_url = "http://localhost:8888/pay";

	// ǩ����ʽ
	public static String sign_type = "RSA2";
	
	// �ַ������ʽ
	public static String charset = "utf-8";
	
	// ֧��������
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// ֧��������
	public static String log_path = "C:\\";


//�����������������������������������Ļ�����Ϣ������������������������������

    /** 
     * д��־��������ԣ�����վ����Ҳ���ԸĳɰѼ�¼�������ݿ⣩
     * @param sWord Ҫд����־����ı�����
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

