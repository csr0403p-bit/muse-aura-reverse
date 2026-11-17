package X;

import java.util.Queue;

/* loaded from: classes5.dex */
public final class CV4 implements CVI {
    public final String A00;
    public final Queue A01;
    public volatile CVI A02;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((CV4) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public CV4(String str, Queue queue) {
        this.A00 = str;
        this.A01 = queue;
    }
}
