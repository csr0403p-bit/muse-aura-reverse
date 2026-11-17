package com.facebook.aura.deeplink;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.network.api.StefiMusePath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.deeplink.HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1", f = "HatchDeeplinkIdResolutionViewModel.kt", l = {88}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ HatchPendingMessage.PendingComposerPromptId $pendingPrompt;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1(HatchPendingMessage.PendingComposerPromptId pendingComposerPromptId, HtJ<? super HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1> htJ) {
        super(2, htJ);
        this.$pendingPrompt = pendingComposerPromptId;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1(this.$pendingPrompt, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1596executeBodylessStefiRequestWithtZkwj4A;
        String str;
        int length;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            StefiMusePath.ResolvePromptId resolvePromptId = new StefiMusePath.ResolvePromptId(this.$pendingPrompt.promptId);
            RequestType requestType = RequestType.GET;
            Long l = new Long(15000L);
            C9jH c9jHA0E = AGH.A0E();
            HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 1;
            objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, resolvePromptId, requestType, null, l, c9jHA0E, c9jHA0E, this);
            if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
        }
        if (objM1596executeBodylessStefiRequestWithtZkwj4A instanceof C10571Hud) {
            objM1596executeBodylessStefiRequestWithtZkwj4A = null;
        }
        ResolvePromptIdResponseJson resolvePromptIdResponseJson = (ResolvePromptIdResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A;
        if (resolvePromptIdResponseJson == null || (str = resolvePromptIdResponseJson.text) == null || (length = str.length()) <= 0 || length > 16384) {
            return null;
        }
        return str;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return new HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1(this.$pendingPrompt, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
