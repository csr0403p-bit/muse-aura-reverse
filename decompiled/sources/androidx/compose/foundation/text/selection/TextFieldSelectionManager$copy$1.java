package androidx.compose.foundation.text.selection;

import X.AbstractC07127nr;
import X.AbstractC1815ArZ;
import X.AbstractC1855AsS;
import X.AnonymousClass001;
import X.ApQ;
import X.Au3;
import X.C1805ArO;
import X.C1860AsY;
import X.C1YP;
import X.C3UX;
import X.C8j3;
import X.C8j4;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.Clipboard;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {891}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class TextFieldSelectionManager$copy$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $cancelSelection;
    public int label;
    public final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLX/HtJ<-Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$copy$1;>;)V */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, HtJ htJ, boolean z) {
        super(2, htJ);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new TextFieldSelectionManager$copy$1(this.this$0, htJ, this.$cancelSelection);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            boolean z = this.$cancelSelection;
            if ((!Au3.A04(C8j4.A0O(textFieldSelectionManager.A0S))) && !(textFieldSelectionManager.A0E instanceof C1YP)) {
                MutableState<C1805ArO> mutableState = textFieldSelectionManager.A0S;
                C1805ArO c1805ArOA0d = C8j4.A0d(mutableState);
                ApQ apQ = c1805ArOA0d.A01;
                long j = c1805ArOA0d.A00;
                ApQ apQSubSequence = apQ.subSequence(Au3.A02(j), Au3.A01(j));
                if (z) {
                    AbstractC1815ArZ.A04(textFieldSelectionManager, C8j4.A0d(mutableState).A01, Au3.A01(C8j4.A0O(mutableState)));
                }
                Clipboard clipboard = this.this$0.A08;
                if (clipboard != null) {
                    C1860AsY c1860AsYA00 = AbstractC1855AsS.A00(apQSubSequence);
                    this.label = 1;
                    if (clipboard.Ad3(c1860AsYA00) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((TextFieldSelectionManager$copy$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
