package com.facebook.aura.settings.importmemory;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.BQG;
import X.C06H;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.settings.importmemory.ChatUploadState;
import com.facebook.aura.settings.importmemory.ImportMemoryEffect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String DEFAULT_ZIP_NAME = "ai-export.zip";
    public static final String IMPORTS_DIR = "imports";
    public static final int MAX_FILE_NAME_LENGTH = 128;
    public static final long MAX_UPLOAD_SIZE_BYTES = 104857600;
    public static final long MAX_UPLOAD_SIZE_MB = 100;
    public static final String TAG = "HatchImportMemoryToHatchVM";
    public final C3Em<ImportMemoryEffect> _effect;
    public final BLG<HatchImportMemoryToHatchUiState> _uiState;
    public final C22I<ImportMemoryEffect> effect;
    public final C1BN<HatchImportMemoryToHatchUiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchImportMemoryToHatchViewModel(this.userSession);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) AbstractC08429uh.A01(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel$addMemory$1", f = "HatchImportMemoryToHatchViewModel.kt", l = {98, 104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel$addMemory$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $text;
        public final /* synthetic */ String $wrapperTemplate;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$wrapperTemplate = str;
            this.$text = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchImportMemoryToHatchViewModel.this.new AnonymousClass1(this.$wrapperTemplate, this.$text, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchImportMemoryToHatchUiState value;
            String str;
            ChatUploadState chatUploadState;
            ChatUploadError chatUploadError;
            Object objEmit;
            HatchImportMemoryToHatchUiState value2;
            String str2;
            ChatUploadState chatUploadState2;
            ChatUploadError chatUploadError2;
            HatchImportMemoryToHatchUiState value3;
            ChatUploadState chatUploadState3;
            ChatUploadError chatUploadError3;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0J(HatchImportMemoryToHatchViewModel.TAG, e2, "addMemory: sendChatMessage failed");
                BLG<HatchImportMemoryToHatchUiState> blg = HatchImportMemoryToHatchViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState = value;
                    str = hatchImportMemoryToHatchUiState.pastedText;
                    chatUploadState = hatchImportMemoryToHatchUiState.chatUploadState;
                    chatUploadError = hatchImportMemoryToHatchUiState.chatUploadError;
                    AnonymousClass003.A0v(str, chatUploadState);
                } while (!blg.A6e(value, new HatchImportMemoryToHatchUiState(str, false, chatUploadState, chatUploadError)));
                C3Em<ImportMemoryEffect> c3Em = HatchImportMemoryToHatchViewModel.this._effect;
                ImportMemoryEffect.ShowToast showToast = new ImportMemoryEffect.ShowToast(R.string._name_removed__res_0x7f120f0d);
                this.L$0 = null;
                this.label = 2;
                objEmit = c3Em.emit(showToast, this);
            }
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            BLG<HatchImportMemoryToHatchUiState> blg2 = HatchImportMemoryToHatchViewModel.this._uiState;
            do {
                value2 = blg2.getValue();
                HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState2 = value2;
                str2 = hatchImportMemoryToHatchUiState2.pastedText;
                chatUploadState2 = hatchImportMemoryToHatchUiState2.chatUploadState;
                chatUploadError2 = hatchImportMemoryToHatchUiState2.chatUploadError;
                AnonymousClass003.A0v(str2, chatUploadState2);
            } while (!blg2.A6e(value2, new HatchImportMemoryToHatchUiState(str2, true, chatUploadState2, chatUploadError2)));
            HatchGatewayConnection.Companion.getInstance(HatchImportMemoryToHatchViewModel.this.userSession).sendChatMessage(String.format(this.$wrapperTemplate, Arrays.copyOf(new Object[]{this.$text}, 1)), null, null, null, AnonymousClass002.A0k());
            BLG<HatchImportMemoryToHatchUiState> blg3 = HatchImportMemoryToHatchViewModel.this._uiState;
            do {
                value3 = blg3.getValue();
                HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState3 = value3;
                chatUploadState3 = hatchImportMemoryToHatchUiState3.chatUploadState;
                chatUploadError3 = hatchImportMemoryToHatchUiState3.chatUploadError;
                C7384Etj.A0Y(chatUploadState3, 2);
            } while (!blg3.A6e(value3, new HatchImportMemoryToHatchUiState("", false, chatUploadState3, chatUploadError3)));
            C3Em<ImportMemoryEffect> c3Em2 = HatchImportMemoryToHatchViewModel.this._effect;
            ImportMemoryEffect.NavigateToConversation navigateToConversation = ImportMemoryEffect.NavigateToConversation.INSTANCE;
            this.L$0 = null;
            this.label = 1;
            objEmit = c3Em2.emit(navigateToConversation, this);
            if (objEmit == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel$summarizeChats$1", f = "HatchImportMemoryToHatchViewModel.kt", l = {234, 240}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel$summarizeChats$1, reason: invalid class name and case insensitive filesystem */
    public final class C136341 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ChatUploadState.Uploaded $uploaded;
        public final /* synthetic */ String $wrapperTemplate;
        public Object L$0;
        public int label;
        public final /* synthetic */ HatchImportMemoryToHatchViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136341(String str, ChatUploadState.Uploaded uploaded, HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, HtJ<? super C136341> htJ) {
            super(2, htJ);
            this.$wrapperTemplate = str;
            this.$uploaded = uploaded;
            this.this$0 = hatchImportMemoryToHatchViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136341(this.$wrapperTemplate, this.$uploaded, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchImportMemoryToHatchUiState value;
            String str;
            ChatUploadState chatUploadState;
            ChatUploadError chatUploadError;
            Object objEmit;
            HatchImportMemoryToHatchUiState value2;
            ChatUploadState.Idle idle;
            String str2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0J(HatchImportMemoryToHatchViewModel.TAG, e2, "summarizeChats: sendChatMessage failed");
                BLG<HatchImportMemoryToHatchUiState> blg = this.this$0._uiState;
                do {
                    value = blg.getValue();
                    HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState = value;
                    str = hatchImportMemoryToHatchUiState.pastedText;
                    chatUploadState = hatchImportMemoryToHatchUiState.chatUploadState;
                    chatUploadError = hatchImportMemoryToHatchUiState.chatUploadError;
                    AnonymousClass003.A0v(str, chatUploadState);
                } while (!blg.A6e(value, new HatchImportMemoryToHatchUiState(str, false, chatUploadState, chatUploadError)));
                C3Em<ImportMemoryEffect> c3Em = this.this$0._effect;
                ImportMemoryEffect.ShowToast showToast = new ImportMemoryEffect.ShowToast(R.string._name_removed__res_0x7f120f0d);
                this.L$0 = null;
                this.label = 2;
                objEmit = c3Em.emit(showToast, this);
            }
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            HatchGatewayConnection.Companion.getInstance(this.this$0.userSession).sendChatMessage(String.format(this.$wrapperTemplate, Arrays.copyOf(new Object[]{this.$uploaded.workspacePath}, 1)), null, null, null, AnonymousClass002.A0k());
            BLG<HatchImportMemoryToHatchUiState> blg2 = this.this$0._uiState;
            do {
                value2 = blg2.getValue();
                idle = ChatUploadState.Idle.INSTANCE;
                str2 = value2.pastedText;
                AnonymousClass003.A0v(str2, idle);
            } while (!blg2.A6e(value2, new HatchImportMemoryToHatchUiState(str2, false, idle, null)));
            C3Em<ImportMemoryEffect> c3Em2 = this.this$0._effect;
            ImportMemoryEffect.NavigateToConversation navigateToConversation = ImportMemoryEffect.NavigateToConversation.INSTANCE;
            this.L$0 = null;
            this.label = 1;
            objEmit = c3Em2.emit(navigateToConversation, this);
            if (objEmit == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136341) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel$uploadChatsZip$1", f = "HatchImportMemoryToHatchViewModel.kt", l = {146, 172}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel$uploadChatsZip$1, reason: invalid class name and case insensitive filesystem */
    public final class C136351 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ Uri $uri;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136351(Context context, Uri uri, HtJ<? super C136351> htJ) {
            super(2, htJ);
            this.$appContext = context;
            this.$uri = uri;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C136351 c136351 = HatchImportMemoryToHatchViewModel.this.new C136351(this.$appContext, this.$uri, htJ);
            c136351.L$0 = obj;
            return c136351;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(1:67)|(1:(1:(8:6|24|25|(2:27|(1:28))(2:31|(2:33|(1:34))(2:37|38))|68|43|63|64)(2:7|8))(2:9|19))(6:10|(1:12)|13|(1:14)|16|(1:18))|20|21|(1:23)|25|(0)(0)|68|43|63|64|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Not initialized variable reg: 10, insn: 0x014a: INVOKE (r10 I:java.io.File) VIRTUAL call: java.io.File.delete():boolean A[Catch: all -> 0x014e, MD:():boolean (c), TRY_ENTER, TRY_LEAVE] (LINE:330), block:B:47:0x014a */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ba A[Catch: Exception -> 0x011c, CancellationException -> 0x0147, all -> 0x0149, TryCatch #8 {CancellationException -> 0x0147, Exception -> 0x011c, blocks: (B:24:0x00b1, B:25:0x00b4, B:27:0x00ba, B:28:0x00be, B:31:0x00e4, B:33:0x00e8, B:34:0x00f9, B:37:0x0117, B:38:0x011b, B:21:0x0083), top: B:67:0x000e, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e4 A[Catch: Exception -> 0x011c, CancellationException -> 0x0147, all -> 0x0149, TryCatch #8 {CancellationException -> 0x0147, Exception -> 0x011c, blocks: (B:24:0x00b1, B:25:0x00b4, B:27:0x00ba, B:28:0x00be, B:31:0x00e4, B:33:0x00e8, B:34:0x00f9, B:37:0x0117, B:38:0x011b, B:21:0x0083), top: B:67:0x000e, outer: #2 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel.C136351.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136351) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchImportMemoryToHatchViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchImportMemoryToHatchUiState("", false, ChatUploadState.Idle.INSTANCE, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 0);
        this._effect = c9290GCr;
        this.effect = C3pd.A00(c9290GCr);
    }

    public final void addMemory(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(this._uiState.getValue().pastedText);
        if (strA0l.length() == 0 || this._uiState.getValue().isSending) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(str, strA0l, null), AEu.A00(this));
    }

    public final void onPastedTextChanged(String str) {
        HatchImportMemoryToHatchUiState value;
        boolean z;
        ChatUploadState chatUploadState;
        ChatUploadError chatUploadError;
        C7384Etj.A0Y(str, 0);
        BLG<HatchImportMemoryToHatchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState = value;
            z = hatchImportMemoryToHatchUiState.isSending;
            chatUploadState = hatchImportMemoryToHatchUiState.chatUploadState;
            chatUploadError = hatchImportMemoryToHatchUiState.chatUploadError;
            C7384Etj.A0Y(chatUploadState, 2);
        } while (!blg.A6e(value, new HatchImportMemoryToHatchUiState(str, z, chatUploadState, chatUploadError)));
    }

    public final void summarizeChats(String str) {
        HatchImportMemoryToHatchUiState value;
        HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState;
        HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState2;
        ChatUploadState.Uploaded uploaded;
        C7384Etj.A0Y(str, 0);
        BLG<HatchImportMemoryToHatchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchImportMemoryToHatchUiState = value;
            if (hatchImportMemoryToHatchUiState.isSending || !(hatchImportMemoryToHatchUiState.chatUploadState instanceof ChatUploadState.Uploaded)) {
                hatchImportMemoryToHatchUiState2 = hatchImportMemoryToHatchUiState;
            } else {
                String str2 = hatchImportMemoryToHatchUiState.pastedText;
                ChatUploadState chatUploadState = hatchImportMemoryToHatchUiState.chatUploadState;
                ChatUploadError chatUploadError = hatchImportMemoryToHatchUiState.chatUploadError;
                AnonymousClass003.A0v(str2, chatUploadState);
                hatchImportMemoryToHatchUiState2 = new HatchImportMemoryToHatchUiState(str2, true, chatUploadState, chatUploadError);
            }
        } while (!blg.A6e(value, hatchImportMemoryToHatchUiState2));
        if (hatchImportMemoryToHatchUiState.isSending) {
            return;
        }
        ChatUploadState chatUploadState2 = hatchImportMemoryToHatchUiState.chatUploadState;
        if (!(chatUploadState2 instanceof ChatUploadState.Uploaded) || (uploaded = (ChatUploadState.Uploaded) chatUploadState2) == null) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C136341(str, uploaded, this, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String resolveDisplayName(android.content.Context r6, android.net.Uri r7) {
        /*
            r5 = this;
            r0 = 36
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r5 = 0
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L47
            java.lang.String[] r4 = new java.lang.String[]{r1}     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L47
            r3 = r7
            r6 = r5
            r7 = r5
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L47
            if (r2 == 0) goto L3d
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L31
            int r0 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L36
            if (r0 < 0) goto L31
            java.lang.String r1 = r2.getString(r0)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L31
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L31
            goto L32
        L31:
            r1 = r5
        L32:
            r2.close()     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L47
            return r1
        L36:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L47
            throw r0     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L47
        L3d:
            return r5
        L3e:
            r2 = move-exception
            java.lang.String r1 = "resolveDisplayName: query failed"
            java.lang.String r0 = "HatchImportMemoryToHatchVM"
            X.CFK.A0K(r0, r2, r1)
            return r5
        L47:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel.resolveDisplayName(android.content.Context, android.net.Uri):java.lang.String");
    }

    public final C22I<ImportMemoryEffect> getEffect() {
        return this.effect;
    }

    public final C1BN<HatchImportMemoryToHatchUiState> getUiState() {
        return this.uiState;
    }

    public final void onChatPickerOpened() {
        HatchImportMemoryToHatchUiState value;
        String str;
        boolean z;
        ChatUploadState chatUploadState;
        BLG<HatchImportMemoryToHatchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState = value;
            str = hatchImportMemoryToHatchUiState.pastedText;
            z = hatchImportMemoryToHatchUiState.isSending;
            chatUploadState = hatchImportMemoryToHatchUiState.chatUploadState;
            AnonymousClass003.A0v(str, chatUploadState);
        } while (!blg.A6e(value, new HatchImportMemoryToHatchUiState(str, z, chatUploadState, null)));
    }

    public final void onChatPickerUnavailable() {
        HatchImportMemoryToHatchUiState value;
        ChatUploadError chatUploadError;
        String str;
        boolean z;
        ChatUploadState chatUploadState;
        BLG<HatchImportMemoryToHatchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState = value;
            chatUploadError = ChatUploadError.PICKER_UNAVAILABLE;
            str = hatchImportMemoryToHatchUiState.pastedText;
            z = hatchImportMemoryToHatchUiState.isSending;
            chatUploadState = hatchImportMemoryToHatchUiState.chatUploadState;
            AnonymousClass003.A0v(str, chatUploadState);
        } while (!blg.A6e(value, new HatchImportMemoryToHatchUiState(str, z, chatUploadState, chatUploadError)));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String sanitize(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\' || Character.isISOControl(cCharAt)) {
                cCharAt = '_';
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        String strA17 = BQG.A17(AbstractC0878AGe.A0L("", "", "", arrayList, null), 128);
        for (int i2 = 0; i2 < strA17.length(); i2++) {
            if (strA17.charAt(i2) != '.') {
                return strA17;
            }
        }
        return DEFAULT_ZIP_NAME;
    }

    public final void uploadChatsZip(Context context, Uri uri) {
        HatchImportMemoryToHatchUiState value;
        HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState;
        HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState2;
        AnonymousClass003.A0u(context, uri);
        BLG<HatchImportMemoryToHatchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchImportMemoryToHatchUiState = value;
            if (hatchImportMemoryToHatchUiState.chatUploadState instanceof ChatUploadState.Idle) {
                ChatUploadState.Uploading uploading = new ChatUploadState.Uploading(DEFAULT_ZIP_NAME);
                String str = hatchImportMemoryToHatchUiState.pastedText;
                boolean z = hatchImportMemoryToHatchUiState.isSending;
                C7384Etj.A0Y(str, 0);
                hatchImportMemoryToHatchUiState2 = new HatchImportMemoryToHatchUiState(str, z, uploading, null);
            } else {
                hatchImportMemoryToHatchUiState2 = hatchImportMemoryToHatchUiState;
            }
        } while (!blg.A6e(value, hatchImportMemoryToHatchUiState2));
        if (hatchImportMemoryToHatchUiState.chatUploadState instanceof ChatUploadState.Idle) {
            Context applicationContext = context.getApplicationContext();
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C136351(applicationContext, uri, null), AEu.A00(this));
        }
    }
}
