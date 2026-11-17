package X;

import com.facebook.rsys.ai.gen.AiInitialSessionParams;
import com.facebook.rsys.ai.gen.AiSessionCreateResult;
import com.facebook.rsys.ai.gen.OptionalParams;

/* loaded from: classes6.dex */
public final class GQi extends AbstractC7559F3s implements G2j<String, Integer, String, OptionalParams, AiSessionCreateResult> {
    public GQi() {
        super(4);
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ AiSessionCreateResult invoke(String str, Integer num, String str2, OptionalParams optionalParams) {
        String str3 = str;
        int iA0F = AnonymousClass001.A0F(num);
        String str4 = str2;
        OptionalParams optionalParams2 = optionalParams;
        AnonymousClass005.A11(str3, str4, optionalParams2, 0);
        return AiInitialSessionParams.CProxy.createWithSessionParams(str3, iA0F, str4, optionalParams2);
    }
}
