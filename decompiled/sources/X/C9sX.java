package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.9sX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sX extends AbstractC07117nq implements G0W<C08059so<Unit, JsonElement>, Unit, HtJ<? super JsonElement>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C9sT this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/9sT;LX/HtJ<-LX/9sX;>;)V */
    public C9sX(HtJ htJ, C9sT c9sT) {
        super(3, htJ);
        this.this$0 = c9sT;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(C08059so<Unit, JsonElement> c08059so, Unit unit, HtJ<? super JsonElement> htJ) {
        C9sX c9sX = new C9sX(htJ, this.this$0);
        c9sX.L$0 = c08059so;
        return c9sX.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C08059so c08059so = (C08059so) this.L$0;
            byte bA04 = this.this$0.A01.A04();
            if (bA04 == 1) {
                return C9sT.A02(this.this$0, true);
            }
            if (bA04 == 0) {
                return C9sT.A02(this.this$0, false);
            }
            if (bA04 != 6) {
                C9sT c9sT = this.this$0;
                if (bA04 == 8) {
                    return C9sT.A01(c9sT);
                }
                C9sS c9sS = c9sT.A01;
                c9sS.A0N("Can't begin reading element, unexpected token", "", c9sS.A00);
                throw F60.createAndThrow();
            }
            C9sT c9sT2 = this.this$0;
            this.label = 1;
            obj = C9sT.A00(c08059so, this, c9sT2);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
