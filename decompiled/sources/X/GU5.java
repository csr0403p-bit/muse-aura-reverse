package X;

import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GU5 extends C06G {
    public final GSS A00;
    public final DevXAgentApi A01;
    public final EnvironmentVariablesProxy A02;
    public final TaskExecutor A03;
    public final Integer A04;
    public final Function0<AudioModule> A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GU5) {
                GU5 gu5 = (GU5) obj;
                if (!C7384Etj.areEqual(this.A02, gu5.A02) || !C7384Etj.areEqual(this.A03, gu5.A03) || !C7384Etj.areEqual(this.A00, gu5.A00) || !C7384Etj.areEqual(this.A05, gu5.A05) || !C7384Etj.areEqual(this.A01, gu5.A01) || this.A06 != gu5.A06 || this.A04 != gu5.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int iA01 = (((C0KA.A01(((((((((AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A02)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0D(this.A01)) * 31 * 31 * 31) + 1237) * 31, this.A06) + 1237) * 31) + 1237) * 31;
        int iIntValue = this.A04.intValue();
        switch (iIntValue) {
            case 1:
                str = "DISABLE_FANOUT";
                break;
            case 2:
                str = "UNSUBSCRIBE";
                break;
            default:
                str = "ENABLED";
                break;
        }
        return (iA01 + str.hashCode() + iIntValue) * 31;
    }

    public GU5(GSS gss, DevXAgentApi devXAgentApi, EnvironmentVariablesProxy environmentVariablesProxy, TaskExecutor taskExecutor, Integer num, Function0 function0, boolean z) {
        this.A02 = environmentVariablesProxy;
        this.A03 = taskExecutor;
        this.A00 = gss;
        this.A05 = function0;
        this.A01 = devXAgentApi;
        this.A06 = z;
        this.A04 = num;
    }
}
