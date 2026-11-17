package X;

/* loaded from: classes4.dex */
public class A7N implements InterfaceC2619Bfl {
    public final A7O innerData;

    public A7N(A7O a7o) {
        C7384Etj.A0Y(a7o, 0);
        this.innerData = a7o;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof A7N) && getClass().equals(obj.getClass()) && this.innerData == ((A7N) obj).innerData;
        }
        return true;
    }

    public final A7O getInnerData__INTERNAL() {
        return this.innerData;
    }

    public final F0r innerCopyBuilder() {
        return this.innerData.AiB();
    }

    public final F0r innerUpdater() {
        return this.innerData.AiB();
    }

    public final boolean isDeepEqual(A7N a7n) {
        return this.innerData.AOK(a7n != null ? a7n.innerData : null);
    }

    public final A7O reinterpretPlugin(int i) {
        return this.innerData.Aa4(i);
    }

    public final A7O reinterpretPluginOptional(int i) {
        return this.innerData.Aa5(i);
    }

    public String toString() {
        return this.innerData.toString();
    }

    public int hashCode() {
        return AnonymousClass005.A0E(getClass()) + System.identityHashCode(this.innerData);
    }
}
