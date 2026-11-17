package com.facebook.aura.vds.compose.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0U;
import X.G0V;
import android.content.res.Resources;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class AuraToastOptionKt {

    /* renamed from: com.facebook.aura.vds.compose.toast.AuraToastOptionKt$AuraToastOption$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<Boolean, Unit> $onChange;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ AuraToastOption $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AuraToastOption auraToastOption, Function0<Unit> function0, Boolean bool, G0U<? super Boolean, Unit> g0u, boolean z, int i, int i2) {
            super(2);
            this.$type = auraToastOption;
            this.$onClick = function0;
            this.$checked = bool;
            this.$onChange = g0u;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            AuraToastOptionKt.AuraToastOption(this.$type, this.$onClick, this.$checked, this.$onChange, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraToastOption(com.facebook.aura.vds.compose.toast.AuraToastOption r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, java.lang.Boolean r44, X.G0U<? super java.lang.Boolean, kotlin.Unit> r45, boolean r46, X.BFM r47, int r48, int r49) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.toast.AuraToastOptionKt.AuraToastOption(com.facebook.aura.vds.compose.toast.AuraToastOption, kotlin.jvm.functions.Function0, java.lang.Boolean, X.G0U, boolean, X.BFM, int, int):void");
    }
}
