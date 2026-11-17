package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.AuraMarkdownUrlResolversKt;

/* loaded from: classes2.dex */
public final class HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$resolveImageUrl$1$1 extends AbstractC7559F3s implements G0U<String, String> {
    public final /* synthetic */ String $imageVersion;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @Override // X.G0U
    public final String invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return AuraMarkdownUrlResolversKt.resolveAuraMarkdownImageUrl(str, this.$userSession, this.$imageVersion);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$resolveImageUrl$1$1(AbstractC3358CGz abstractC3358CGz, String str) {
        super(1);
        this.$userSession = abstractC3358CGz;
        this.$imageVersion = str;
    }
}
