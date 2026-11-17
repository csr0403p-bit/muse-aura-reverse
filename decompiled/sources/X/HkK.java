package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HkK {
    public final List<FBY> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HkK) && this.A00.equals(((HkK) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("BloksComponentQueryNetworkParseResponse(results=", this.A00);
    }

    public HkK(List<FBY> list) {
        this.A00 = list;
    }
}
