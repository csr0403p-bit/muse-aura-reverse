package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsCollaboratingSectionKt {

    /* renamed from: com.facebook.aura.pairs.ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsResource $item;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ ConnectionsSpaceIcon $spaceIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConnectionsResource connectionsResource, ConnectionsSpaceIcon connectionsSpaceIcon, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$item = connectionsResource;
            this.$spaceIcon = connectionsSpaceIcon;
            this.$onOpen = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsCollaboratingSectionKt.ConnectionsCollaboratingRow(this.$item, this.$spaceIcon, this.$onOpen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $groupConnectionId;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $museId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$museId = str;
            this.$groupConnectionId = str2;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsCollaboratingSectionKt.ConnectionsCollaboratingSection(this.$museId, this.$groupConnectionId, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C128183 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $groupConnectionId;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $museId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128183(String str, String str2, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$museId = str;
            this.$groupConnectionId = str2;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsCollaboratingSectionKt.ConnectionsCollaboratingSection(this.$museId, this.$groupConnectionId, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConnectionsCollaboratingRow(com.facebook.aura.pairs.ConnectionsResource r36, com.facebook.aura.pairs.ConnectionsSpaceIcon r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, X.BRg r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsCollaboratingSectionKt.ConnectionsCollaboratingRow(com.facebook.aura.pairs.ConnectionsResource, com.facebook.aura.pairs.ConnectionsSpaceIcon, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConnectionsCollaboratingSection(java.lang.String r41, java.lang.String r42, com.facebook.aura.pairs.ConnectionsLogContext r43, X.BRg r44, X.BFM r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsCollaboratingSectionKt.ConnectionsCollaboratingSection(java.lang.String, java.lang.String, com.facebook.aura.pairs.ConnectionsLogContext, X.BRg, X.BFM, int, int):void");
    }
}
