package X;

import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;

/* loaded from: classes6.dex */
public final class GV4 extends EnvironmentVariablesProxy {
    public final /* synthetic */ GTn A00;

    public GV4(GTn gTn) {
        this.A00 = gTn;
    }

    @Override // com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy
    public final String copyValue(int i) {
        String str = (String) BV5.A0f(this.A00.A06, i);
        if (str == null) {
            return null;
        }
        return str;
    }
}
