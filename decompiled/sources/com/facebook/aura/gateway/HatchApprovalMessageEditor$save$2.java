package com.facebook.aura.gateway;

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
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchApprovalMessageEditor$save$2", f = "HatchApprovalMessageEditor.kt", l = {131}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchApprovalMessageEditor$save$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ String $approvalId;
    public final /* synthetic */ List<String> $attachmentIds;
    public final /* synthetic */ String $body;
    public final /* synthetic */ String $expectedGatewayUrl;
    public final /* synthetic */ long $expectedMessageRevision;
    public final /* synthetic */ String $subject;
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
    public int label;
    public final /* synthetic */ HatchApprovalMessageEditor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchApprovalMessageEditor$save$2(String str, String str2, String str3, List<String> list, long j, HatchApprovalMessageEditor hatchApprovalMessageEditor, String str4, HtJ<? super HatchApprovalMessageEditor$save$2> htJ) {
        super(2, htJ);
        this.$approvalId = str;
        this.$subject = str2;
        this.$body = str3;
        this.$attachmentIds = list;
        this.$expectedMessageRevision = j;
        this.this$0 = hatchApprovalMessageEditor;
        this.$expectedGatewayUrl = str4;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchApprovalMessageEditor$save$2(this.$approvalId, this.$subject, this.$body, this.$attachmentIds, this.$expectedMessageRevision, this.this$0, this.$expectedGatewayUrl, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<Unit>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1599executeJarvisRequestWithFof5HsY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String str = this.$expectedGatewayUrl;
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            HatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
            HatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
            this.I$1 = 0;
            this.I$2 = 0;
            this.I$3 = 1;
            this.I$4 = 0;
            this.I$5 = 0;
            this.I$6 = 0;
            this.label = 1;
            objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchApprovalMessageEditor$save$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, new JarvisPath.ApprovalEditMessage(this.$approvalId), new EditApprovalMessageRequestJson(this.$subject, this.$body, this.$attachmentIds, this.$expectedMessageRevision), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, false, c9jHA0E, str, false, true, false, false, null, false, this);
            if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
        }
        return C3cG.A0t(objM1599executeJarvisRequestWithFof5HsY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<Unit>> htJ) {
        return ((HatchApprovalMessageEditor$save$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
