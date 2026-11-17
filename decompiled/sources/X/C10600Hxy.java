package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {296, 304, 308}, m = "invokeSuspend", v = 2)
/* renamed from: X.Hxy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10600Hxy extends AbstractC07117nq implements G0V<BOZ<? super String>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ CharSequence $input;
    public final /* synthetic */ int $limit;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C06827l3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/7l3;Ljava/lang/CharSequence;ILX/HtJ<-LX/Hxy;>;)V */
    public C10600Hxy(CharSequence charSequence, HtJ htJ, C06827l3 c06827l3, int i) {
        super(2, htJ);
        this.this$0 = c06827l3;
        this.$input = charSequence;
        this.$limit = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C10600Hxy c10600Hxy = new C10600Hxy(this.$input, htJ, this.this$0, this.$limit);
        c10600Hxy.L$0 = obj;
        return c10600Hxy;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:18:0x0059). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r5 = r10.L$0
            X.BOZ r5 = (X.BOZ) r5
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r6 = 3
            r9 = 2
            r7 = 1
            if (r0 == 0) goto L18
            if (r0 == r7) goto L94
            if (r0 == r9) goto L50
            if (r0 == r6) goto L94
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L18:
            X.Hwg.A00(r11)
            X.7l3 r0 = r10.this$0
            java.util.regex.Pattern r1 = r0.nativePattern
            java.lang.CharSequence r0 = r10.$input
            java.util.regex.Matcher r8 = r1.matcher(r0)
            int r0 = r10.$limit
            if (r0 == r7) goto L80
            boolean r0 = r8.find()
            if (r0 == 0) goto L80
            r1 = 0
            r3 = 0
        L31:
            java.lang.CharSequence r2 = r10.$input
            int r0 = r8.start()
            java.lang.CharSequence r0 = r2.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            r10.L$0 = r5
            r10.L$1 = r8
            r10.I$0 = r1
            r10.I$1 = r3
            r10.label = r9
            X.Hji r0 = r5.A00(r0, r10)
            if (r0 != r4) goto L59
            return r4
        L50:
            int r3 = r10.I$1
            java.lang.Object r8 = r10.L$1
            java.util.regex.Matcher r8 = (java.util.regex.Matcher) r8
            X.Hwg.A00(r11)
        L59:
            int r1 = r8.end()
            int r3 = r3 + 1
            int r0 = r10.$limit
            int r0 = r0 - r7
            if (r3 == r0) goto L6a
            boolean r0 = r8.find()
            if (r0 != 0) goto L31
        L6a:
            java.lang.CharSequence r0 = r10.$input
            java.lang.CharSequence r0 = X.AbstractC7608F5v.A0c(r0, r1)
            java.lang.String r2 = r0.toString()
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.I$0 = r1
            r10.I$1 = r3
            r10.label = r6
            goto L8d
        L80:
            java.lang.CharSequence r0 = r10.$input
            java.lang.String r2 = r0.toString()
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.label = r7
        L8d:
            X.Hji r0 = r5.A00(r2, r10)
            if (r0 != r4) goto L97
            return r4
        L94:
            X.Hwg.A00(r11)
        L97:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10600Hxy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(BOZ<? super String> boz, HtJ<? super Unit> htJ) {
        return ((C10600Hxy) C8j3.A1E(htJ, boz, this)).invokeSuspend(Unit.INSTANCE);
    }
}
