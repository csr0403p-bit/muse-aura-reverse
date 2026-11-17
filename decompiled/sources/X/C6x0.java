package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* renamed from: X.6x0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6x0 {
    public final C6x2 A00;
    public final String A01;
    public final String A02;

    public C6x0(C6x2 c6x2, String str, String str2) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw C60O.A0i("Path should start with a slash '/'.");
        }
        if (!str2.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
            throw C60O.A0i("Path should end with a slash '/'");
        }
        this.A01 = str;
        this.A02 = str2;
        this.A00 = c6x2;
    }
}
