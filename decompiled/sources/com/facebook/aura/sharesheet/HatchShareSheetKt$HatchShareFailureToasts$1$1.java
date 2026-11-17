package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareFailureToasts$1$1", f = "HatchShareSheet.kt", l = {504}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareFailureToasts$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $mediaFailedMessage;
    public final /* synthetic */ String $sendFailedMessage;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareFailureToasts$1$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, HtJ<? super HatchShareSheetKt$HatchShareFailureToasts$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$sendFailedMessage = str;
        this.$mediaFailedMessage = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetKt$HatchShareFailureToasts$1$1(this.$viewModel, this.$context, this.$sendFailedMessage, this.$mediaFailedMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchShareFailure> c22i = this.$viewModel.sendFailures;
            final Context context = this.$context;
            final String str = this.$sendFailedMessage;
            final String str2 = this.$mediaFailedMessage;
            C20Z<? super HatchShareFailure> c20z = new C20Z() { // from class: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareFailureToasts$1$1.1

                /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareFailureToasts$1$1$1$WhenMappings */
                public abstract /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[HatchShareFailure.values().length];
                        try {
                            AnonymousClass002.A13(HatchShareFailure.SEND, iArr);
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            AnonymousClass002.A14(HatchShareFailure.MEDIA_PROCESSING, iArr);
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchShareFailure) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HatchShareFailure hatchShareFailure, HtJ<? super Unit> htJ) {
                    String str3;
                    Context context2 = context;
                    int iOrdinal = hatchShareFailure.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            str3 = str2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str3 = str;
                    }
                    HatchShareSheetKt.showSendFailureToast(context2, str3);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetKt$HatchShareFailureToasts$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
