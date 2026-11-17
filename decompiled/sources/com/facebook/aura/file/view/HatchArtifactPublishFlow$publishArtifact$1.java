package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.file.view.PublishState;
import com.facebook.aura.gateway.HatchFileOperations;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.HatchArtifactPublishFlow$publishArtifact$1", f = "HatchArtifactPublishFlow.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchArtifactPublishFlow$publishArtifact$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchArtifactPublishFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchArtifactPublishFlow$publishArtifact$1(HatchArtifactPublishFlow hatchArtifactPublishFlow, HtJ<? super HatchArtifactPublishFlow$publishArtifact$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchArtifactPublishFlow;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchArtifactPublishFlow$publishArtifact$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchArtifactPublishFlow$publishArtifact$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String strProjectDirFromPath;
        PublishState failed;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            strProjectDirFromPath = this.this$0.projectDirFromPath();
            HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            this.L$0 = strProjectDirFromPath;
            this.label = 1;
            obj = hatchFileOperations.shareArtifact(strProjectDirFromPath, abstractC3358CGz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            strProjectDirFromPath = C3cG.A0d(this.L$0, obj);
        }
        HatchFileOperations.ShareArtifactResult shareArtifactResult = (HatchFileOperations.ShareArtifactResult) obj;
        HatchArtifactPublishFlow hatchArtifactPublishFlow = this.this$0;
        if (shareArtifactResult instanceof HatchFileOperations.ShareArtifactResult.Success) {
            hatchArtifactPublishFlow.setDeployed$fbandroid_express_aura_java_com_facebook_aura_file_view_view(true);
            HatchFileOperations.ShareArtifactResult.Success success = (HatchFileOperations.ShareArtifactResult.Success) shareArtifactResult;
            this.this$0.setDeployedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view(success.url);
            this.this$0.setHasServerChanges$fbandroid_express_aura_java_com_facebook_aura_file_view_view(false);
            this.this$0.deployHolder.onPublished(strProjectDirFromPath, success.url);
            failed = new PublishState.Success(success.url);
        } else {
            if (!(shareArtifactResult instanceof HatchFileOperations.ShareArtifactResult.Failed)) {
                throw C3cG.A0q();
            }
            failed = new PublishState.Failed(PublishState.RetryAction.DEPLOY);
        }
        hatchArtifactPublishFlow.setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(failed);
        return Unit.INSTANCE;
    }
}
