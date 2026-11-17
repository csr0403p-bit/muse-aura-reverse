package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1 extends AbstractC7559F3s implements G0V<Uri, String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $folderPath;
    public final /* synthetic */ Function0<Unit> $onUploadComplete;
    public final /* synthetic */ String $uploadFailedMessage;
    public final /* synthetic */ String $uploadForbiddenMessage;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1", f = "LibraryUploadMenu.kt", l = {103}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fallbackName;
        public final /* synthetic */ String $folderPath;
        public final /* synthetic */ Function0<Unit> $onUploadComplete;
        public final /* synthetic */ String $uploadFailedMessage;
        public final /* synthetic */ String $uploadForbiddenMessage;
        public final /* synthetic */ Uri $uri;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, String str, String str2, Context context, Uri uri, String str3, String str4, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$onUploadComplete = function0;
            this.$uploadForbiddenMessage = str;
            this.$uploadFailedMessage = str2;
            this.$context = context;
            this.$uri = uri;
            this.$fallbackName = str3;
            this.$folderPath = str4;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$onUploadComplete, this.$uploadForbiddenMessage, this.$uploadFailedMessage, this.$context, this.$uri, this.$fallbackName, this.$folderPath, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(obj);
                LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1 libraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1 = new LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1(this.$context, this.$uri, this.$fallbackName, this.$folderPath, this.$userSession, null);
                this.label = 1;
                obj = GAo.A00(this, c78tA0s, libraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchFileOperations.WriteResult writeResult = (HatchFileOperations.WriteResult) obj;
            if (writeResult instanceof HatchFileOperations.WriteResult.Success) {
                this.$onUploadComplete.invoke();
            } else {
                if (!(writeResult instanceof HatchFileOperations.WriteResult.Failed)) {
                    throw new NoWhenBranchMatchedException();
                }
                ToastApi.INSTANCE.showToast(LibraryUploadMenuKt.UPLOAD_ERROR_FORBIDDEN.equals(((HatchFileOperations.WriteResult.Failed) writeResult).code) ? this.$uploadForbiddenMessage : this.$uploadFailedMessage);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1(C3UX c3ux, Function0<Unit> function0, String str, String str2, Context context, String str3, AbstractC3358CGz abstractC3358CGz) {
        super(2);
        this.$coroutineScope = c3ux;
        this.$onUploadComplete = function0;
        this.$uploadForbiddenMessage = str;
        this.$uploadFailedMessage = str2;
        this.$context = context;
        this.$folderPath = str3;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri, String str) {
        invoke2(uri, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Uri uri, String str) {
        AnonymousClass003.A0u(uri, str);
        AnonymousClass001.A1J(new AnonymousClass1(this.$onUploadComplete, this.$uploadForbiddenMessage, this.$uploadFailedMessage, this.$context, uri, str, this.$folderPath, this.$userSession, null), this.$coroutineScope);
    }
}
