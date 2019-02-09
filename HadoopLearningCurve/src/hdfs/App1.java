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
		 * @param in 输入流
		 * @param out 输出流
		 * @param buffSize 缓冲区大小
		 * @param close 是否关闭流
		 */
		IOUtils.copyBytes(in, System.out, 1024, true);
	}
}
