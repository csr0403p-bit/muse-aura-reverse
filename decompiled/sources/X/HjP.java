package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class HjP implements Serializable {
    public static final long serialVersionUID = 1;
    public final int hashCode;
    public final Object key;
    public final Class<?> scope;
    public final Class<?> type;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                HjP hjP = (HjP) obj;
                if (!hjP.key.equals(this.key) || hjP.type != this.type || hjP.scope != this.scope) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        Object obj = this.key;
        Class<?> cls = this.type;
        String name = HatchPersistedMessageJson.UNSEND_STATUS_NONE;
        String name2 = cls == null ? HatchPersistedMessageJson.UNSEND_STATUS_NONE : cls.getName();
        Class<?> cls2 = this.scope;
        if (cls2 != null) {
            name = cls2.getName();
        }
        return String.format("[ObjectId: key=%s, type=%s, scope=%s]", obj, name2, name);
    }

    public HjP(Class<?> cls, Class<?> cls2, Object obj) {
        this.type = cls;
        this.scope = cls2;
        this.key = obj;
        int iA0H = AnonymousClass001.A0H(cls.getName(), obj.hashCode());
        this.hashCode = cls2 != null ? iA0H ^ cls2.getName().hashCode() : iA0H;
    }
}
