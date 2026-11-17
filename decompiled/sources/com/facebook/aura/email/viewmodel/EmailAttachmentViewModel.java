package com.facebook.aura.email.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.email.model.EmailAttachmentFile;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.email.viewmodel.EmailAttachmentUiState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class EmailAttachmentViewModel extends AEs {
    public final BLG<EmailAttachmentUiState> _state;
    public final int attachmentIndex;
    public final Context context;
    public final String environmentId;
    public HoC loadJob;
    public final String messageId;
    public final EmailRepository repository;
    public final C1BN<EmailAttachmentUiState> state;

    public final class Factory extends AuraViewModelFactory<EmailAttachmentViewModel> {
        public final Context appContext;
        public final int attachmentIndex;
        public final String environmentId;
        public final String messageId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public EmailAttachmentViewModel create() {
            Context context = this.appContext;
            C7384Etj.A0T(context);
            return new EmailAttachmentViewModel(context, EmailRepository.Companion.getInstance(this.userSession), this.environmentId, this.messageId, this.attachmentIndex);
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz, String str, String str2, int i) {
            AnonymousClass005.A14(context, abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.environmentId = str;
            this.messageId = str2;
            this.attachmentIndex = i;
            this.appContext = context.getApplicationContext();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailAttachmentViewModel$retry$1", f = "EmailAttachmentViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.viewmodel.EmailAttachmentViewModel$retry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return EmailAttachmentViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return EmailAttachmentViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    EmailAttachmentViewModel.this._state.Af8(EmailAttachmentUiState.Loading.INSTANCE);
                    EmailAttachmentViewModel emailAttachmentViewModel = EmailAttachmentViewModel.this;
                    C20Q<EmailAttachmentFile> c20qAttachmentFile = emailAttachmentViewModel.repository.attachmentFile(emailAttachmentViewModel.context, emailAttachmentViewModel.environmentId, emailAttachmentViewModel.messageId, emailAttachmentViewModel.attachmentIndex);
                    final EmailAttachmentViewModel emailAttachmentViewModel2 = EmailAttachmentViewModel.this;
                    C20Z<? super EmailAttachmentFile> c20z = new C20Z() { // from class: com.facebook.aura.email.viewmodel.EmailAttachmentViewModel.retry.1.1
                        public final Object emit(EmailAttachmentFile emailAttachmentFile, HtJ<? super Unit> htJ) {
                            AnonymousClass002.A1I(emailAttachmentViewModel2._state, new EmailAttachmentUiState.Loaded(emailAttachmentFile));
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((EmailAttachmentFile) obj2, (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (c20qAttachmentFile.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                EmailAttachmentViewModel.this._state.Af8(EmailAttachmentUiState.Error.INSTANCE);
                throw e;
            } catch (Exception unused) {
                EmailAttachmentViewModel.this._state.Af8(EmailAttachmentUiState.Error.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final C1BN<EmailAttachmentUiState> getState() {
        return this.state;
    }

    public final void retry() {
        HoC hoC = this.loadJob;
        if (hoC == null || !hoC.isActive()) {
            this.loadJob = AnonymousClass001.A11(new AnonymousClass1(null), AEu.A00(this));
        }
    }

    public EmailAttachmentViewModel(Context context, EmailRepository emailRepository, String str, String str2, int i) {
        AnonymousClass005.A14(context, emailRepository, str, str2);
        this.context = context;
        this.repository = emailRepository;
        this.environmentId = str;
        this.messageId = str2;
        this.attachmentIndex = i;
        C9286GCn c9286GCnA01 = HnJ.A01(EmailAttachmentUiState.Loading.INSTANCE);
        this._state = c9286GCnA01;
        this.state = C3Pi.A00(c9286GCnA01);
        retry();
    }
}
