package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.PublishState;
import com.facebook.aura.gateway.HatchArtifactPublishLogger;
import com.facebook.aura.gateway.HatchFileOperations;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.HatchArtifactPublishFlow$unpublishArtifact$1", f = "HatchArtifactPublishFlow.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchArtifactPublishFlow$unpublishArtifact$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $retrySource;
    public long J$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchArtifactPublishFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchArtifactPublishFlow$unpublishArtifact$1(HatchArtifactPublishFlow hatchArtifactPublishFlow, String str, HtJ<? super HatchArtifactPublishFlow$unpublishArtifact$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchArtifactPublishFlow;
        this.$retrySource = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchArtifactPublishFlow$unpublishArtifact$1(this.this$0, this.$retrySource, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String strProjectDirFromPath;
        long jNow;
        PublishState failed;
        Object objRemoveArtifact = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(objRemoveArtifact);
            strProjectDirFromPath = this.this$0.projectDirFromPath();
            HatchArtifactPublishLogger hatchArtifactPublishLogger = HatchArtifactPublishLogger.INSTANCE;
            String str = this.$retrySource;
            HatchArtifactPublishFlow hatchArtifactPublishFlow = this.this$0;
            hatchArtifactPublishLogger.logUnpublishStarted(str, strProjectDirFromPath, hatchArtifactPublishFlow.fileName, C3cH.A0m("isHtmlDeployed", String.valueOf(MutableState.A0A(this.this$0.isDeployed$delegate)), C3cG.A0r("relativePath", hatchArtifactPublishFlow.relativePath), C3cG.A0r("deployedArtifactUrl", MutableState.A05(hatchArtifactPublishFlow.deployedUrl$delegate))));
            jNow = HatchArtifactPublishLogger.clock.now();
            HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            this.L$0 = strProjectDirFromPath;
            this.J$0 = jNow;
            this.label = 1;
            objRemoveArtifact = hatchFileOperations.removeArtifact(strProjectDirFromPath, abstractC3358CGz, this);
            if (objRemoveArtifact == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            jNow = this.J$0;
            strProjectDirFromPath = C3cG.A0d(this.L$0, objRemoveArtifact);
        }
        HatchFileOperations.RemoveArtifactResult removeArtifactResult = (HatchFileOperations.RemoveArtifactResult) objRemoveArtifact;
        HatchArtifactPublishLogger hatchArtifactPublishLogger2 = HatchArtifactPublishLogger.INSTANCE;
        long jNow2 = HatchArtifactPublishLogger.clock.now() - jNow;
        HatchArtifactPublishFlow hatchArtifactPublishFlow2 = this.this$0;
        if (removeArtifactResult instanceof HatchFileOperations.RemoveArtifactResult.Success) {
            hatchArtifactPublishLogger2.logUnpublishSuccess(this.$retrySource, strProjectDirFromPath, ((HatchFileOperations.RemoveArtifactResult.Success) removeArtifactResult).destroyed, jNow2);
            this.this$0.setDeployedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view(null);
            this.this$0.setDeployed$fbandroid_express_aura_java_com_facebook_aura_file_view_view(false);
            this.this$0.deployHolder.onUnpublished(strProjectDirFromPath);
            failed = PublishState.Unpublished.INSTANCE;
        } else {
            if (!(removeArtifactResult instanceof HatchFileOperations.RemoveArtifactResult.Failed)) {
                throw C3cG.A0q();
            }
            hatchArtifactPublishLogger2.logUnpublishFailed(this.$retrySource, strProjectDirFromPath, ((HatchFileOperations.RemoveArtifactResult.Failed) removeArtifactResult).reason, jNow2, AnonymousClass006.A10("deployedArtifactUrl", MutableState.A05(hatchArtifactPublishFlow2.deployedUrl$delegate)));
            failed = new PublishState.Failed(PublishState.RetryAction.UNPUBLISH);
        }
        hatchArtifactPublishFlow2.setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(failed);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchArtifactPublishFlow$unpublishArtifact$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
