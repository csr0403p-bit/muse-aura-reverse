package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.gateway.HatchFileOperations;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1", f = "HatchArtifactPublishFlow.kt", l = {HatchDeviceBleManagerKt.REQUESTED_MTU, 251}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ HatchArtifactPublishFlow $flow;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1(boolean z, String str, AbstractC3358CGz abstractC3358CGz, HatchArtifactPublishFlow hatchArtifactPublishFlow, HtJ<? super HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1> htJ) {
        super(2, htJ);
        this.$enabled = z;
        this.$relativePath = str;
        this.$userSession = abstractC3358CGz;
        this.$flow = hatchArtifactPublishFlow;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1(this.$enabled, this.$relativePath, this.$userSession, this.$flow, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchFileOperations.FetchArtifactUrlResult fetchArtifactUrlResult;
        HatchFileOperations.StatResult statResult;
        Long iso8601ToMs;
        HatchFileOperations.StatResult.Success success;
        HatchFileOperations.FileEntry fileEntry;
        String str;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$enabled) {
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String strResolveProjectDirFromPath = hatchFileOperations.resolveProjectDirFromPath(this.$relativePath);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = null;
                this.label = 1;
                obj = hatchFileOperations.fetchArtifactUrl(strResolveProjectDirFromPath, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            fetchArtifactUrlResult = (HatchFileOperations.FetchArtifactUrlResult) this.L$1;
            Hwg.A00(obj);
            statResult = (HatchFileOperations.StatResult) obj;
            iso8601ToMs = null;
            if ((statResult instanceof HatchFileOperations.StatResult.Success) && (success = (HatchFileOperations.StatResult.Success) statResult) != null && (fileEntry = success.entry) != null && (str = fileEntry.modifiedAt) != null) {
                iso8601ToMs = HatchFileOperations.INSTANCE.parseIso8601ToMs(str);
            }
            this.$flow.setHasServerChanges$fbandroid_express_aura_java_com_facebook_aura_file_view_view(HatchFileOperations.INSTANCE.fileModifiedAfterDeploy(((HatchFileOperations.FetchArtifactUrlResult.Success) fetchArtifactUrlResult).lastUpdated, iso8601ToMs));
            return Unit.INSTANCE;
        }
        Hwg.A00(obj);
        HatchFileOperations.FetchArtifactUrlResult fetchArtifactUrlResult2 = (HatchFileOperations.FetchArtifactUrlResult) obj;
        if (fetchArtifactUrlResult2 instanceof HatchFileOperations.FetchArtifactUrlResult.Success) {
            this.$flow.setDeployed$fbandroid_express_aura_java_com_facebook_aura_file_view_view(true);
            fetchArtifactUrlResult = fetchArtifactUrlResult2;
            this.$flow.setDeployedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view(((HatchFileOperations.FetchArtifactUrlResult.Success) fetchArtifactUrlResult).url);
            HatchFileOperations hatchFileOperations2 = HatchFileOperations.INSTANCE;
            String str2 = this.$relativePath;
            AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
            this.L$0 = null;
            this.L$1 = fetchArtifactUrlResult2;
            this.label = 2;
            obj = hatchFileOperations2.statFile(str2, abstractC3358CGz2, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            statResult = (HatchFileOperations.StatResult) obj;
            iso8601ToMs = null;
            if (statResult instanceof HatchFileOperations.StatResult.Success) {
                iso8601ToMs = HatchFileOperations.INSTANCE.parseIso8601ToMs(str);
            }
            this.$flow.setHasServerChanges$fbandroid_express_aura_java_com_facebook_aura_file_view_view(HatchFileOperations.INSTANCE.fileModifiedAfterDeploy(((HatchFileOperations.FetchArtifactUrlResult.Success) fetchArtifactUrlResult).lastUpdated, iso8601ToMs));
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
