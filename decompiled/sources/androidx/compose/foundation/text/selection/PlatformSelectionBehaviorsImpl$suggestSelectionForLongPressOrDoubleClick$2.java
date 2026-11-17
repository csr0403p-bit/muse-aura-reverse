package androidx.compose.foundation.text.selection;

import X.AbstractC07127nr;
import X.AbstractC1815ArZ;
import X.AnonymousClass001;
import X.Au3;
import X.C6Xb;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2261BLa;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends AbstractC07127nr implements G0V<TextClassifier, HtJ<? super Au3>, Object> {
    public final /* synthetic */ long $selection;
    public final /* synthetic */ CharSequence $text;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl;LX/HtJ<-Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;>;)V */
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, HtJ htJ, long j) {
        super(2, htJ);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = platformSelectionBehaviorsImpl;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.this$0, this.$text, htJ, this.$selection);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        TextSelection textSelectionSuggestSelection;
        long jA00;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        InterfaceC2261BLa interfaceC2261BLa;
        CharSequence charSequence;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            CharSequence charSequence2 = this.$text;
            long j = this.$selection;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(charSequence2, Au3.A02(j), Au3.A01(j)).setDefaultLocales(PlatformSelectionBehaviorsImpl.A00(this.this$0));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            jA00 = AbstractC1815ArZ.A00(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = this.this$0;
                CharSequence charSequence3 = this.$text;
                this.J$0 = jA00;
                this.label = 2;
                if (PlatformSelectionBehaviorsImpl.A01(textClassifier, platformSelectionBehaviorsImpl2, charSequence3, this, jA00) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                platformSelectionBehaviorsImpl = this.this$0;
                interfaceC2261BLa = platformSelectionBehaviorsImpl.A06;
                charSequence = this.$text;
                this.L$0 = textSelectionSuggestSelection;
                this.L$1 = interfaceC2261BLa;
                this.L$2 = platformSelectionBehaviorsImpl;
                this.L$3 = charSequence;
                this.J$0 = jA00;
                this.label = 1;
                if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                C7384Etj.A0X(textClassification);
                platformSelectionBehaviorsImpl.A03.Af8(new C6Xb(textClassification, charSequence, jA00));
            }
        } else if (i == 1) {
            jA00 = this.J$0;
            charSequence = (CharSequence) this.L$3;
            platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$2;
            interfaceC2261BLa = (InterfaceC2261BLa) this.L$1;
            textSelectionSuggestSelection = (TextSelection) this.L$0;
            Hwg.A00(obj);
            try {
                TextClassification textClassification2 = textSelectionSuggestSelection.getTextClassification();
                C7384Etj.A0X(textClassification2);
                platformSelectionBehaviorsImpl.A03.Af8(new C6Xb(textClassification2, charSequence, jA00));
            } finally {
                interfaceC2261BLa.Ahe(null);
            }
        } else {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            jA00 = this.J$0;
            Hwg.A00(obj);
        }
        return new Au3(jA00);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(TextClassifier textClassifier, HtJ<? super Au3> htJ) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) AbstractC07127nr.A09(htJ, textClassifier, this)).invokeSuspend(Unit.INSTANCE);
    }
}
