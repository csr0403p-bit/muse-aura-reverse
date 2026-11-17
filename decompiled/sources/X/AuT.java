package X;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.ImeAction;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuT implements InterfaceC1631An5 {
    public Rect A00;
    public C1897AtH A01;
    public TextFieldSelectionManager A02;
    public InterfaceC1079AXi A03;
    public final View A09;
    public final AzY A0A;
    public final AuR A0B;
    public G0U<? super List<? extends AzK>, Unit> A07 = new C2279BSf(24);
    public G0U<? super ImeAction, Unit> A08 = new C2279BSf(25);
    public C1805ArO A05 = new C1805ArO("", Au3.A01);
    public AuI A04 = AuI.A06;
    public List<WeakReference<AuO>> A06 = C3cG.A0h();
    public final F0C A0C = AbstractC5321DgF.A02(C79.A0C, C2298BSy.A00(this, 27));

    @Override // X.InterfaceC1631An5
    public final /* bridge */ /* synthetic */ InputConnection A7q(EditorInfo editorInfo) {
        C1805ArO c1805ArO = this.A05;
        AbstractC1644AnK.A00(editorInfo, this.A04, c1805ArO.A01.A00, null, c1805ArO.A00);
        if (E9X.A08 != null) {
            E9X.A00().A05(editorInfo);
        }
        C1805ArO c1805ArO2 = this.A05;
        boolean z = this.A04.A04;
        AuO auO = new AuO(this.A01, new C2112Ayc(this), this.A02, this.A03, c1805ArO2, z);
        this.A06.add(new WeakReference<>(auO));
        return auO;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/view/View;LX/G0U<-LX/AiN;Lkotlin/Unit;>;LX/AzY;)V */
    public AuT(View view, AzY azY, G0U g0u) {
        this.A09 = view;
        this.A0A = azY;
        this.A0B = new AuR(azY, g0u);
    }
}
