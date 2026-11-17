package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AG1<T> implements C1bi, InterfaceC1559AlZ {
    public AG2 A00;
    public AFx A01;
    public AFs<T, Object> A02;
    public T A03;
    public String A04;
    public Object[] A05;
    public final Function0<Object> A06 = new C2293BSt(this, 27);

    public static final void A00(AG1 ag1) {
        StringBuilder sb;
        String str;
        String string;
        AFx aFx = ag1.A01;
        AG2 ag2 = ag1.A00;
        if (ag2 != null) {
            StringBuilder sb2 = new StringBuilder("entry(");
            sb2.append(ag2);
            sb2.append(") is not null");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (aFx != null) {
            Function0<? extends Object> function0 = ag1.A06;
            Object objInvoke = function0.invoke();
            if (objInvoke == null || aFx.A5t(objInvoke)) {
                ag1.A00 = aFx.Aa3(ag1.A04, function0);
                return;
            }
            if (objInvoke instanceof AG4) {
                AG4 ag4 = (AG4) objInvoke;
                ATF<T> atfAIq = ag4.AIq();
                if (atfAIq != AGG.A00 && atfAIq != AGE.A00 && atfAIq != AG5.A00) {
                    string = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                    throw new IllegalArgumentException(string);
                }
                sb = new StringBuilder("MutableState containing ");
                sb.append(ag4.getValue());
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                sb = new StringBuilder();
                sb.append(objInvoke);
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            sb.append(str);
            string = sb.toString();
            throw new IllegalArgumentException(string);
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        AG2 ag2 = this.A00;
        if (ag2 != null) {
            ag2.Ahh();
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        AG2 ag2 = this.A00;
        if (ag2 != null) {
            ag2.Ahh();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AFs<TT;Ljava/lang/Object;>;LX/AFx;Ljava/lang/String;TT;[Ljava/lang/Object;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public AG1(AFx aFx, AFs aFs, Object obj, String str, Object[] objArr) {
        this.A02 = aFs;
        this.A01 = aFx;
        this.A04 = str;
        this.A03 = obj;
        this.A05 = objArr;
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
        A00(this);
    }
}
