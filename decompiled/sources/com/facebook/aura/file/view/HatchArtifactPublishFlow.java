package com.facebook.aura.file.view;

import X.AGE;
import X.AGF;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.C7mU;
import X.FGI;
import X.G0V;
import X.HtJ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.repo.ArtifactDeployHolder;
import com.facebook.aura.file.view.PublishState;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.utils.ArtifactShareOption;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchArtifactPublishFlow {
    public static final int $stable = 0;
    public final Context context;
    public final ArtifactDeployHolder deployHolder;
    public final MutableState deployedUrl$delegate;
    public final MutableState enabled$delegate;
    public final String fileName;
    public final MutableState hasServerChanges$delegate;
    public final MutableState isDeployed$delegate;
    public final MutableState publishState$delegate;
    public final String relativePath;
    public final C3UX scope;
    public final String source;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.HatchArtifactPublishFlow$onShareClicked$1", f = "HatchArtifactPublishFlow.kt", l = {82, 86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.HatchArtifactPublishFlow$onShareClicked$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $hasChanges;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$hasChanges = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchArtifactPublishFlow.this.new AnonymousClass1(this.$hasChanges, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 2
                r6 = 1
                if (r0 == 0) goto L57
                if (r0 == r6) goto L74
                if (r0 != r5) goto L9e
                java.lang.Object r6 = r7.L$2
                com.facebook.aura.file.view.HatchArtifactPublishFlow r6 = (com.facebook.aura.file.view.HatchArtifactPublishFlow) r6
                java.lang.Object r3 = r7.L$1
                com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult r3 = (com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult) r3
                X.Hwg.A00(r8)
            L17:
                com.facebook.aura.gateway.HatchFileOperations$StatResult r8 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r8
                boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
                r2 = 0
                if (r0 == 0) goto L30
                com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r8 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r8
                if (r8 == 0) goto L30
                com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r8.entry
                if (r0 == 0) goto L30
                java.lang.String r1 = r0.modifiedAt
                if (r1 == 0) goto L30
                com.facebook.aura.gateway.HatchFileOperations r0 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
                java.lang.Long r2 = r0.parseIso8601ToMs(r1)
            L30:
                com.facebook.aura.gateway.HatchFileOperations r1 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
                com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult$Success r3 = (com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult.Success) r3
                java.lang.String r0 = r3.lastUpdated
                boolean r0 = r1.fileModifiedAfterDeploy(r0, r2)
                if (r0 != 0) goto L50
                boolean r0 = r7.$hasChanges
                if (r0 != 0) goto L50
                java.lang.String r1 = r3.url
                r0 = 0
                com.facebook.aura.file.view.PublishState$UpToDate r2 = new com.facebook.aura.file.view.PublishState$UpToDate
                r2.<init>(r1, r0)
            L48:
                com.facebook.aura.file.view.PublishState r2 = (com.facebook.aura.file.view.PublishState) r2
            L4a:
                r6.setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(r2)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L50:
                r0 = 0
                com.facebook.aura.file.view.PublishState$HasChanges r2 = new com.facebook.aura.file.view.PublishState$HasChanges
                r2.<init>(r0)
                goto L48
            L57:
                X.Hwg.A00(r8)
                com.facebook.aura.gateway.HatchFileOperations r3 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
                com.facebook.aura.file.view.HatchArtifactPublishFlow r0 = com.facebook.aura.file.view.HatchArtifactPublishFlow.this
                java.lang.String r0 = r0.relativePath
                java.lang.String r2 = r3.resolveProjectDirFromPath(r0)
                com.facebook.aura.file.view.HatchArtifactPublishFlow r0 = com.facebook.aura.file.view.HatchArtifactPublishFlow.this
                X.CGz r1 = r0.userSession
                r0 = 0
                r7.L$0 = r0
                r7.label = r6
                java.lang.Object r8 = r3.fetchArtifactUrl(r2, r1, r7)
                if (r8 != r4) goto L77
            L73:
                return r4
            L74:
                X.Hwg.A00(r8)
            L77:
                com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult r8 = (com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult) r8
                com.facebook.aura.file.view.HatchArtifactPublishFlow r6 = com.facebook.aura.file.view.HatchArtifactPublishFlow.this
                boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult.Success
                if (r0 == 0) goto L97
                com.facebook.aura.gateway.HatchFileOperations r3 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
                java.lang.String r2 = r6.relativePath
                X.CGz r1 = r6.userSession
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r8
                r7.L$2 = r6
                r7.label = r5
                java.lang.Object r0 = r3.statFile(r2, r1, r7)
                if (r0 == r4) goto L73
                r3 = r8
                r8 = r0
                goto L17
            L97:
                boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult.Failed
                if (r0 == 0) goto La3
                com.facebook.aura.file.view.PublishState$Ready r2 = com.facebook.aura.file.view.PublishState.Ready.INSTANCE
                goto L4a
            L9e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            La3:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HatchArtifactPublishFlow.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onShareClicked(boolean z, Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 1);
        if (!MutableState.A0A(this.enabled$delegate)) {
            function0.invoke();
            return;
        }
        String strA05 = MutableState.A05(this.deployedUrl$delegate);
        if (strA05 != null && !MutableState.A0A(this.hasServerChanges$delegate) && !z) {
            setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(new PublishState.UpToDate(strA05, false));
            return;
        }
        setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(PublishState.Loading.INSTANCE);
        AnonymousClass001.A1J(new AnonymousClass1(z, null), this.scope);
    }

    public final void setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(PublishState publishState) {
        C7384Etj.A0Y(publishState, 0);
        this.publishState$delegate.Af8(publishState);
    }

    public final void sharePublishedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view(String str) {
        C7384Etj.A0Y(str, 0);
        Intent intentA0A = C60R.A0A(str);
        C60Q.A0S().A05(this.context, Intent.createChooser(intentA0A, null));
    }

    public final void unpublishArtifact$fbandroid_express_aura_java_com_facebook_aura_file_view_view(String str) {
        PublishState upToDate;
        C7384Etj.A0Y(str, 0);
        PublishState publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view = getPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view();
        if (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.HasChanges) {
            upToDate = new PublishState.HasChanges(true);
        } else if (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.UpToDate) {
            String str2 = ((PublishState.UpToDate) publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view).url;
            C7384Etj.A0Y(str2, 0);
            upToDate = new PublishState.UpToDate(str2, true);
        } else {
            upToDate = PublishState.Loading.INSTANCE;
        }
        setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(upToDate);
        AnonymousClass001.A1J(new HatchArtifactPublishFlow$unpublishArtifact$1(this, str, null), this.scope);
    }

    public final void viewPublishedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view(String str) {
        C7384Etj.A0Y(str, 0);
        boolean z = C7Je.A02;
        C7mU.A00().A02().A05(this.context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PublishState.RetryAction.values().length];
            try {
                AnonymousClass002.A13(PublishState.RetryAction.DEPLOY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PublishState.RetryAction.UNPUBLISH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String projectDirFromPath() {
        String str = this.relativePath;
        boolean zA0q = C7BY.A0q(C7BY.A0V(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str), ".", false);
        String str2 = this.relativePath;
        return zA0q ? C7BY.A0X(str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2) : str2;
    }

    public static /* synthetic */ void unpublishArtifact$fbandroid_express_aura_java_com_facebook_aura_file_view_view$default(HatchArtifactPublishFlow hatchArtifactPublishFlow, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchArtifactPublishFlow.source;
        }
        hatchArtifactPublishFlow.unpublishArtifact$fbandroid_express_aura_java_com_facebook_aura_file_view_view(str);
    }

    public final void dismiss$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(PublishState.Hidden.INSTANCE);
    }

    public final String getDeployedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        return MutableState.A05(this.deployedUrl$delegate);
    }

    public final boolean getEnabled$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        return MutableState.A0A(this.enabled$delegate);
    }

    public final String getFileName$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        return this.fileName;
    }

    public final boolean getHasServerChanges$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        return MutableState.A0A(this.hasServerChanges$delegate);
    }

    public final PublishState getPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        return (PublishState) this.publishState$delegate.getValue();
    }

    public final ArtifactShareOption getShareOption() {
        if (MutableState.A0A(this.enabled$delegate)) {
            if (MutableState.A0A(this.isDeployed$delegate) && MutableState.A0A(this.hasServerChanges$delegate)) {
                return ArtifactShareOption.PUBLISH;
            }
            if (!MutableState.A0A(this.isDeployed$delegate)) {
                return ArtifactShareOption.PUBLISH_TO_SHARE;
            }
        }
        return ArtifactShareOption.SHARE;
    }

    public final boolean isDeployed$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        return MutableState.A0A(this.isDeployed$delegate);
    }

    public final void onFileEdited() {
        if (MutableState.A0A(this.enabled$delegate) && MutableState.A0A(this.isDeployed$delegate)) {
            setHasServerChanges$fbandroid_express_aura_java_com_facebook_aura_file_view_view(true);
            setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(new PublishState.HasChanges(false));
            this.deployHolder.onEdited(HatchFileOperations.INSTANCE.resolveProjectDirFromPath(this.relativePath));
        }
    }

    public final void publishArtifact$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        AnonymousClass001.A1J(new HatchArtifactPublishFlow$publishArtifact$1(this, null), this.scope);
    }

    public final void setDeployed$fbandroid_express_aura_java_com_facebook_aura_file_view_view(boolean z) {
        MutableState.A09(z, this.isDeployed$delegate);
    }

    public final void setDeployedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view(String str) {
        this.deployedUrl$delegate.Af8(str);
    }

    public final void setEnabled$fbandroid_express_aura_java_com_facebook_aura_file_view_view(boolean z) {
        MutableState.A09(z, this.enabled$delegate);
    }

    public final void setHasServerChanges$fbandroid_express_aura_java_com_facebook_aura_file_view_view(boolean z) {
        MutableState.A09(z, this.hasServerChanges$delegate);
    }

    public HatchArtifactPublishFlow(Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, ArtifactDeployHolder artifactDeployHolder, String str, String str2, String str3) {
        boolean zA1b = AnonymousClass004.A1b(context, abstractC3358CGz);
        AnonymousClass005.A16(c3ux, artifactDeployHolder, str, str2, 2);
        C7384Etj.A0Y(str3, 6);
        this.context = context;
        this.userSession = abstractC3358CGz;
        this.scope = c3ux;
        this.deployHolder = artifactDeployHolder;
        this.relativePath = str;
        this.fileName = str2;
        this.source = str3;
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        AGE ageA01 = AGF.A01();
        this.enabled$delegate = C3cG.A08(ageA01, boolValueOf);
        this.publishState$delegate = C3cG.A08(ageA01, PublishState.Hidden.INSTANCE);
        this.isDeployed$delegate = C3cG.A08(ageA01, boolValueOf);
        this.hasServerChanges$delegate = C3cG.A08(ageA01, boolValueOf);
        this.deployedUrl$delegate = C3cG.A08(ageA01, null);
    }

    public final void retry$fbandroid_express_aura_java_com_facebook_aura_file_view_view() {
        PublishState.Failed failed;
        PublishState publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view = getPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view();
        if (!(publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.Failed) || (failed = (PublishState.Failed) publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view) == null) {
            return;
        }
        int iOrdinal = failed.retryAction.ordinal();
        if (iOrdinal == 0) {
            setPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view(PublishState.Ready.INSTANCE);
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            unpublishArtifact$fbandroid_express_aura_java_com_facebook_aura_file_view_view(FGI.A0M(this.source, ".retry"));
        }
    }
}
