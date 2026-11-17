package X;

import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* renamed from: X.6oa, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6oa implements C6pD {
    public final ProfileBoundaryInterface A00;
    public final C6ob A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6oa) {
            return this.A02.equals(((C6oa) obj).A02);
        }
        return false;
    }

    @Override // X.C6pD
    public final String getName() {
        if (C6xU.A0h.A01()) {
            return this.A02;
        }
        throw C60Q.A0q();
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6ob] */
    public C6oa(final ProfileBoundaryInterface profileBoundaryInterface) {
        this.A00 = profileBoundaryInterface;
        final String name = profileBoundaryInterface.getName();
        this.A02 = name;
        this.A01 = new Object(name, profileBoundaryInterface) { // from class: X.6ob
            public final String A00;
            public final ProfileBoundaryInterface A01;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C6ob) {
                    return this.A00.equals(((C6ob) obj).A00);
                }
                return false;
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            {
                this.A01 = profileBoundaryInterface;
                this.A00 = name;
            }
        };
    }
}
