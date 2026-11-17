package X;

import android.content.SharedPreferences;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes5.dex */
public final class ED7 extends ED8 {
    public final SharedPreferences A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ED7(SharedPreferences sharedPreferences, String str) {
        super(str);
        C7384Etj.A0Y(str, 0);
        this.A00 = sharedPreferences;
        this.A01 = FGI.A0M(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
    }
}
