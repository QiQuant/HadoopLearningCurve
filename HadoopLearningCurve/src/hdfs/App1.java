package hdfs;

import java.io.InputStream;
import java.net.URL;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

public class App1 {
	public static final String HDFS_PATH = "hdfs://192.168.80.100:9000/test/hello";
	public static void main(String[] args) throws Exception {
		URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
		final URL url=new URL(HDFS_PATH);
		final InputStream in=url.openStream();
		/**
		 * @param in ������
		 * @param out �����
		 * @param buffSize ��������С
		 * @param close �Ƿ�ر���
		 */
		IOUtils.copyBytes(in, System.out, 1024, true);
	}
}
