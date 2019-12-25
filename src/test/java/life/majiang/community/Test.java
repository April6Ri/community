package life.majiang.community;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @Annotation 111
 * @Author ZhaoTianZe on 2019/12/24 0024
 */
public class Test {
    public static void main(String[] args) {
        SoftReference<Object> softReference = new SoftReference<Object>(new Object());
        WeakReference<Object> weakReference = new WeakReference<Object>(new Object());
        ReferenceQueue referenceQueue = new ReferenceQueue();
        PhantomReference<Object> phantomReference = new PhantomReference<>(new Object(), referenceQueue);

    }


}
