package X;

import com.facebook.common.callercontext.ContextChain;
import kotlin.Unit;

/* renamed from: X.19O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19O extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Object $callerContext;
    public final /* synthetic */ C1423Ais $colorFilter;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ ARL $contentScale;
    public final /* synthetic */ ContextChain $contextChain;
    public final /* synthetic */ Ej6 $imageListener;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C7197Ei9 $options;
    public final /* synthetic */ boolean $releaseWhileStopped;
    public final /* synthetic */ Ejq $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19O(BRg bRg, C1423Ais c1423Ais, ARL arl, ContextChain contextChain, Ej6 ej6, C7197Ei9 c7197Ei9, Ejq ejq, Object obj, String str, int i, int i2, boolean z) {
        super(2);
        this.$modifier = bRg;
        this.$source = ejq;
        this.$options = c7197Ei9;
        this.$callerContext = obj;
        this.$contentDescription = str;
        this.$contextChain = contextChain;
        this.$imageListener = ej6;
        this.$contentScale = arl;
        this.$colorFilter = c1423Ais;
        this.$releaseWhileStopped = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        Ejq ejq = this.$source;
        C7197Ei9 c7197Ei9 = this.$options;
        Object obj = this.$callerContext;
        String str = this.$contentDescription;
        ContextChain contextChain = this.$contextChain;
        Ej6 ej6 = this.$imageListener;
        ARL arl = this.$contentScale;
        C1Hg.A01(bfmA0P, bRg, this.$colorFilter, arl, contextChain, ej6, c7197Ei9, ejq, obj, str, AnonymousClass011.A00(this.$$changed), this.$$default, this.$releaseWhileStopped);
        return Unit.INSTANCE;
    }
}
