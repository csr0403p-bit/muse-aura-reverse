package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C3UX;
import X.C78N;
import X.C7BY;
import X.G0U;
import X.G0V;
import X.G2k;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.ui.DeleteConfirmationDialogKt;
import com.facebook.aura.ui.RenameDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WorkspaceEntryActionsHostKt {

    /* renamed from: com.facebook.aura.file.view.WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G2k<G0U<? super WorkspaceEntry, Unit>, G0U<? super WorkspaceEntry, Unit>, G0U<? super WorkspaceEntry, Unit>, BFM, Integer, Unit> $content;
        public final /* synthetic */ String $deleteLoggerSource;
        public final /* synthetic */ Function0<Unit> $onRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function0<Unit> function0, String str, G2k<? super G0U<? super WorkspaceEntry, Unit>, ? super G0U<? super WorkspaceEntry, Unit>, ? super G0U<? super WorkspaceEntry, Unit>, ? super BFM, ? super Integer, Unit> g2k, int i) {
            super(2);
            this.$onRefresh = function0;
            this.$deleteLoggerSource = str;
            this.$content = g2k;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WorkspaceEntryActionsHostKt.WorkspaceEntryActionsHost(this.$onRefresh, this.$deleteLoggerSource, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void WorkspaceEntryActionsHost(Function0<Unit> function0, String str, G2k<? super G0U<? super WorkspaceEntry, Unit>, ? super G0U<? super WorkspaceEntry, Unit>, ? super G0U<? super WorkspaceEntry, Unit>, ? super BFM, ? super Integer, Unit> g2k, BFM bfm, int i) {
        AnonymousClass005.A10(function0, str, g2k);
        bfm.AgG(1157419136);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g2k);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT2;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState3 = (MutableState) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onRenameClick$1$1(mutableState2, mutableState3);
                bfm.Ai0(objAaT4);
            }
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDeleteClick$1$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            boolean zA1S = AnonymousClass005.A1S(bfm, c3ux, contextA0H, abstractC3358CGzA0h);
            Object objAaT6 = bfm.AaT();
            if (zA1S || objAaT6 == obj) {
                objAaT6 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDownloadClick$1$1(c3ux, contextA0H, abstractC3358CGzA0h);
                bfm.Ai0(objAaT6);
            }
            g2k.invoke(objAaT4, objAaT5, objAaT6, bfm, Integer.valueOf(((iA0T << 3) & 7168) | 54));
            WorkspaceEntry workspaceEntry = (WorkspaceEntry) mutableState.getValue();
            if (workspaceEntry != null) {
                bfm.AgE(677390647);
                boolean zA1Z = AnonymousClass002.A1Z(workspaceEntry.type, WorkspaceEntry.EntryType.DIRECTORY);
                String str2 = workspaceEntry.name;
                boolean zA1V = AnonymousClass004.A1V(bfm, c3ux, zA1Z, AnonymousClass002.A1V(bfm, abstractC3358CGzA0h, AnonymousClass004.A1I(iA0T), bfm.A67(workspaceEntry))) | AnonymousClass004.A1F(iA0T);
                Object objAaT7 = bfm.AaT();
                if (zA1V || objAaT7 == obj) {
                    objAaT7 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$1$1(workspaceEntry, str, abstractC3358CGzA0h, zA1Z, c3ux, function0, mutableState);
                    bfm.Ai0(objAaT7);
                }
                Function0 function02 = (Function0) objAaT7;
                boolean zA67 = bfm.A67(workspaceEntry);
                Object objAaT8 = bfm.AaT();
                if (zA67 || objAaT8 == obj) {
                    objAaT8 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$2$1(workspaceEntry, mutableState);
                    bfm.Ai0(objAaT8);
                }
                DeleteConfirmationDialogKt.DeleteConfirmationDialog(str2, function02, (Function0) objAaT8, zA1Z, bfm, 0, 0);
            } else {
                bfm.AgE(678385282);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            WorkspaceEntry workspaceEntry2 = (WorkspaceEntry) mutableState2.getValue();
            if (workspaceEntry2 != null) {
                bfm.AgE(678504663);
                String strA05 = MutableState.A05(mutableState3);
                String str3 = workspaceEntry2.name;
                Object objAaT9 = bfm.AaT();
                if (objAaT9 == obj) {
                    objAaT9 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$3$1(mutableState3);
                    bfm.Ai0(objAaT9);
                }
                G0U g0u = (G0U) objAaT9;
                boolean zA1S2 = AnonymousClass005.A1S(bfm, workspaceEntry2, c3ux, abstractC3358CGzA0h) | AnonymousClass002.A1O(iA0T & 14);
                Object objAaT10 = bfm.AaT();
                if (zA1S2 || objAaT10 == obj) {
                    objAaT10 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$4$1(workspaceEntry2, c3ux, mutableState3, abstractC3358CGzA0h, function0, mutableState2);
                    bfm.Ai0(objAaT10);
                }
                Function0 function03 = (Function0) objAaT10;
                boolean zA672 = bfm.A67(workspaceEntry2);
                Object objAaT11 = bfm.AaT();
                if (zA672 || objAaT11 == obj) {
                    objAaT11 = new WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$5$1(workspaceEntry2, mutableState2);
                    bfm.Ai0(objAaT11);
                }
                RenameDialogKt.RenameDialog(strA05, str3, g0u, function03, (Function0) objAaT11, bfm, 384);
            } else {
                bfm.AgE(679683810);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(function0, str, g2k, i);
        }
    }

    public static final void logWorkspaceClick(HatchComponent hatchComponent, WorkspaceEntry workspaceEntry) {
        String strA0u = AnonymousClass001.A0u(C7BY.A0R(workspaceEntry.name, "", '.'));
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, hatchComponent, null, (workspaceEntry.type == WorkspaceEntry.EntryType.DIRECTORY || strA0u.length() == 0) ? null : AnonymousClass007.A0c(HatchMetadataKey.FILE_TYPE, strA0u), null);
    }
}
