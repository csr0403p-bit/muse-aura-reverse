package X;

import android.content.Context;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.InputStream;

/* renamed from: X.C3k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3209C3k extends AbstractC3211C3m {
    public String A00;
    public final String A01;

    @Override // X.AbstractC3211C3m
    public final InputStream A01(String str, String str2) {
        String str3 = this.A01;
        if (!"base".equals(str3) && !str3.startsWith("config.")) {
            return super.A01(str, str2);
        }
        Context context = ETi.A03;
        if (context != null) {
            return context.getAssets().openNonAssetFd(FGI.A0d("lib/", str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2)).createInputStream();
        }
        throw C3cG.A0Q("SoLoader.init() not yet called");
    }

    public final String toString() {
        return FGI.A0M("dynamic split:", this.A01);
    }

    public C3209C3k(String str) {
        this.A01 = str;
    }

    public C3209C3k(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
