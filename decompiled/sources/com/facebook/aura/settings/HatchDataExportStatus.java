package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C8eO;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.notifications.push.HatchDownloadCompletion;
import com.facebook.aura.settings.HatchDataExportResult;
import com.facebook.aura.settings.HatchDataExportState;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchDataExportStatus implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final BLG<HatchDataExportState> _state;
    public static HoC exportJob;
    public static final C1BN<HatchDataExportState> state;
    public static final HatchDataExportStatus INSTANCE = new HatchDataExportStatus();
    public static final C3UX scope = Hxb.A02(AnonymousClass001.A0y().plus(new C8eO(null)));

    @DebugMetadata(c = "com.facebook.aura.settings.HatchDataExportStatus$start$1", f = "HatchDataExportStatus.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchDataExportStatus$start$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ HatchAppEventLoggingContext $loggingContext;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, AbstractC3358CGz abstractC3358CGz, HatchAppEventLoggingContext hatchAppEventLoggingContext, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$appContext = context;
            this.$userSession = abstractC3358CGz;
            this.$loggingContext = hatchAppEventLoggingContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$appContext, this.$userSession, this.$loggingContext, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDataExportRepository hatchDataExportRepository = HatchDataExportRepository.INSTANCE;
                Context context = this.$appContext;
                C7384Etj.A0X(context);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                HatchAppEventLoggingContext hatchAppEventLoggingContext = this.$loggingContext;
                this.label = 1;
                obj = hatchDataExportRepository.exportToDownloads(context, abstractC3358CGz, hatchAppEventLoggingContext, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDataExportResult hatchDataExportResult = (HatchDataExportResult) obj;
            if (hatchDataExportResult instanceof HatchDataExportResult.Success) {
                HatchDataExportStatus._state.Af8(HatchDataExportState.Idle.INSTANCE);
                HatchDownloadCompletion hatchDownloadCompletion = HatchDownloadCompletion.INSTANCE;
                Context context2 = this.$appContext;
                C7384Etj.A0X(context2);
                HatchDataExportResult.Success success = (HatchDataExportResult.Success) hatchDataExportResult;
                Uri uri = success.uri;
                String str = success.mimeType;
                String str2 = success.fileName;
                hatchDownloadCompletion.onDownloadComplete(context2, uri, str, str2, this.$appContext.getString(R.string._name_removed__res_0x7f1208bb, str2));
            } else {
                if (!(hatchDataExportResult instanceof HatchDataExportResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                CFK.A06(HatchDataExportStatusKt.TAG, FGI.A0M("DYI export failed: ", ((HatchDataExportResult.Failure) hatchDataExportResult).reason));
                HatchDataExportStatus._state.Af8(HatchDataExportState.Error.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        C9286GCn c9286GCnA01 = HnJ.A01(HatchDataExportState.Idle.INSTANCE);
        _state = c9286GCnA01;
        state = new C3Pi(null, c9286GCnA01);
    }

    public final void cancel() {
        HoC hoC = exportJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        exportJob = null;
        _state.Af8(HatchDataExportState.Idle.INSTANCE);
    }

    public final C1BN<HatchDataExportState> getState() {
        return state;
    }

    public final void start(Context context, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1a = AnonymousClass002.A1a(context, abstractC3358CGz);
        HoC hoC = exportJob;
        if (hoC == null || hoC.isActive() != zA1a) {
            Context applicationContext = context.getApplicationContext();
            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1208ba);
            _state.Af8(HatchDataExportState.Running.INSTANCE);
            HatchAppEventLoggingContext hatchAppEventLoggingContextCaptureContext = HatchAppEventLogger.INSTANCE.captureContext();
            exportJob = AnonymousClass001.A11(new AnonymousClass1(applicationContext, abstractC3358CGz, hatchAppEventLoggingContextCaptureContext, null), scope);
        }
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        cancel();
    }
}
