package com.facebook.aura.file.utils;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$downloadHtmlAsPdf$htmlContent$1", f = "HatchFileUIUtils.kt", l = {1099}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchFileUIUtils$downloadHtmlAsPdf$htmlContent$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ String $resolvedPath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFileUIUtils$downloadHtmlAsPdf$htmlContent$1(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchFileUIUtils$downloadHtmlAsPdf$htmlContent$1> htJ) {
        super(2, htJ);
        this.$resolvedPath = str;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchFileUIUtils$downloadHtmlAsPdf$htmlContent$1(this.$resolvedPath, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
            List listMakePathCandidates = hatchFileUIUtils.makePathCandidates(this.$resolvedPath);
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.L$0 = null;
            this.label = 1;
            obj = HatchFileUIUtils.readFirstAvailable$default(hatchFileUIUtils, listMakePathCandidates, abstractC3358CGz, null, this, 4, null);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((HatchFileUIUtils$downloadHtmlAsPdf$htmlContent$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
