package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.pairs.PairsPendingLevelStoreKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchApprovalMessageEditor$fetch$2", f = "HatchApprovalMessageEditor.kt", l = {107}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchApprovalMessageEditor$fetch$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends EditableMessageEditor>>, Object> {
    public final /* synthetic */ String $approvalId;
    public int I$0;
    public int I$1;
    public int I$2;
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
    public HatchApprovalMessageEditor$fetch$2(HatchApprovalMessageEditor hatchApprovalMessageEditor, String str, HtJ<? super HatchApprovalMessageEditor$fetch$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchApprovalMessageEditor;
        this.$approvalId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchApprovalMessageEditor$fetch$2(this.this$0, this.$approvalId, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends EditableMessageEditor>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<EditableMessageEditor>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String gatewayUrl;
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            gatewayUrl = HatchGatewayPrefsStore.Companion.getInstance(this.this$0.userSession).getGatewayUrl();
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            HatchApprovalMessageEditor$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchApprovalMessageEditor$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchApprovalMessageEditor$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = gatewayUrl;
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
            objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchApprovalMessageEditor$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, new JarvisPath.ApprovalEditableMessage(this.$approvalId), RequestType.GET, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, gatewayUrl, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            gatewayUrl = (String) this.L$0;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        String str = this.$approvalId;
        if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
            try {
                EditableMessageEditorResultJson editableMessageEditorResultJson = (EditableMessageEditorResultJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
                if (!C7384Etj.areEqual(editableMessageEditorResultJson.editor.approval_id, str)) {
                    throw C3cG.A0Q("Approval editor ID mismatch");
                }
                EditableMessageEditorJson editableMessageEditorJson = editableMessageEditorResultJson.editor;
                if (editableMessageEditorJson.message_revision < 0) {
                    throw C3cG.A0Q("Invalid approval message revision");
                }
                if (!PairsPendingLevelStoreKt.STATE_PENDING.equals(editableMessageEditorJson.status)) {
                    throw new NetworkException("Approval is no longer pending", 409, "conflict", null, null, null, null);
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = editableMessageEditorJson.toDomain(gatewayUrl);
            } catch (Throwable th) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = C3cG.A0s(th);
            }
        }
        return C3cG.A0t(objM1595executeBodylessJarvisRequestWithp3iPjrY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<EditableMessageEditor>> htJ) {
        return ((HatchApprovalMessageEditor$fetch$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
