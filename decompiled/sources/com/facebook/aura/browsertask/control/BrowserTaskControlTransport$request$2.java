package com.facebook.aura.browsertask.control;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3UX;
import X.C3cG;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.browsertask.control.BrowserTaskControlTransport$request$2", f = "BrowserTaskControlTransport.kt", l = {96, 150}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserTaskControlTransport$request$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends BrowserTaskSnapshotJson>>, Object> {
    public final /* synthetic */ RequestType $requestType;
    public final /* synthetic */ String $suffix;
    public final /* synthetic */ String $taskId;
    public final /* synthetic */ long $timeoutSeconds;
    public final /* synthetic */ BrowserViewerPreference $viewer;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ BrowserTaskControlTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserTaskControlTransport$request$2(String str, String str2, BrowserViewerPreference browserViewerPreference, RequestType requestType, BrowserTaskControlTransport browserTaskControlTransport, long j, HtJ<? super BrowserTaskControlTransport$request$2> htJ) {
        super(2, htJ);
        this.$taskId = str;
        this.$suffix = str2;
        this.$viewer = browserViewerPreference;
        this.$requestType = requestType;
        this.this$0 = browserTaskControlTransport;
        this.$timeoutSeconds = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserTaskControlTransport$request$2(this.$taskId, this.$suffix, this.$viewer, this.$requestType, this.this$0, this.$timeoutSeconds, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends BrowserTaskSnapshotJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<BrowserTaskSnapshotJson>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1599executeJarvisRequestWithFof5HsY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            JarvisPath jarvisPathBrowserTaskEndpoint = BrowserTaskControlTransportKt.browserTaskEndpoint(this.$taskId, this.$suffix);
            BrowserViewerPreference browserViewerPreference = this.$viewer;
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            if (browserViewerPreference == null) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                BrowserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 browserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = BrowserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(browserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, jarvisPathBrowserTaskEndpoint, this.$requestType, this.this$0.userSession, C3cG.A0S(this.$timeoutSeconds), new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
            } else {
                Set<Integer> setA182 = AnonymousClass004.A18();
                C9jH c9jHA0E2 = AGH.A0E();
                BrowserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 browserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = BrowserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                BrowserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 browserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = BrowserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 2;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(browserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, browserTaskControlTransport$request$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, jarvisPathBrowserTaskEndpoint, BrowserTaskControlJsonKt.toRequestJson(browserViewerPreference), this.$requestType, this.this$0.userSession, C3cG.A0S(this.$timeoutSeconds), null, new HxE[0], setA182, true, true, c9jHA0E2, null, false, true, false, false, null, false, this);
            }
            if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
        }
        return C3cG.A0t(objM1599executeJarvisRequestWithFof5HsY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<BrowserTaskSnapshotJson>> htJ) {
        return ((BrowserTaskControlTransport$request$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
