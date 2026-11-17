package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public final class HlK extends ConcurrentHashMap<String, String> {
    public static final HlK A00 = new HlK();
    public static final long serialVersionUID = 1;
    public final ReentrantLock lock;

    public HlK() {
        super(280, 0.8f, 4);
        this.lock = new ReentrantLock();
    }

    public final String A00(String str) {
        String strA0h = BV4.A0h(str, this);
        if (strA0h != null) {
            return strA0h;
        }
        if (size() >= 280 && this.lock.tryLock()) {
            try {
                if (size() >= 280) {
                    clear();
                }
            } finally {
                this.lock.unlock();
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
