package X;

import java.io.Serializable;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public abstract class CVB implements Serializable, CVI {
    public static final long serialVersionUID = 7535258609338176893L;
    public String name;

    public Object readResolve() {
        return LoggerFactory.getLogger("NOP");
    }
}
