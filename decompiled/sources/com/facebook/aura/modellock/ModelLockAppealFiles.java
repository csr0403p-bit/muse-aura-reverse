package com.facebook.aura.modellock;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C4JM;
import X.C7BY;
import X.CEV;
import X.CFK;
import X.CFP;
import X.FGI;
import X.G0V;
import X.GAo;
import X.GBK;
import X.HtJ;
import X.Hu0;
import X.Hwg;
import com.facebook.aura.executors.AuraExecutors;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ModelLockAppealFiles {
    public static final ModelLockAppealFiles INSTANCE = new ModelLockAppealFiles();
    public static final String TAG = "ModelLockAppealFiles";
    public static final GBK serialDispatcher;
    public static final Executor serialExecutor;

    @DebugMetadata(c = "com.facebook.aura.modellock.ModelLockAppealFiles$stage$2", f = "ModelLockAppealFiles.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.modellock.ModelLockAppealFiles$stage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super File>, Object> {
        public final /* synthetic */ ModelLockAppealFile $appealFile;
        public final /* synthetic */ Function0<Boolean> $isCurrent;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Boolean> function0, ModelLockAppealFile modelLockAppealFile, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$isCurrent = function0;
            this.$appealFile = modelLockAppealFile;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$isCurrent, this.$appealFile, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (!AnonymousClass003.A1Y(this.$isCurrent)) {
                return null;
            }
            try {
                ModelLockAppealFiles modelLockAppealFiles = ModelLockAppealFiles.INSTANCE;
                CEV.A03(modelLockAppealFiles.getDir());
                modelLockAppealFiles.getDir().mkdirs();
                String str = this.$appealFile.fileName;
                String strA0a = C7BY.A0a(C7BY.A0T(str, str, '.'), '.');
                if (strA0a.length() == 0) {
                    strA0a = "data";
                }
                File fileA0O = C3cG.A0O(modelLockAppealFiles.getDir(), FGI.A0M(strA0a, ".txt"));
                CFP.A06(fileA0O, this.$appealFile.bytes);
                return fileA0O;
            } catch (IOException e) {
                CFK.A0K(ModelLockAppealFiles.TAG, e, "Could not stage the appeal file");
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super File> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        Executor executorCreateSerialIOExecutor = AuraExecutors.INSTANCE.createSerialIOExecutor();
        serialExecutor = executorCreateSerialIOExecutor;
        serialDispatcher = Hu0.A01(executorCreateSerialIOExecutor);
    }

    public final void delete() {
        serialExecutor.execute(new Runnable() { // from class: com.facebook.aura.modellock.ModelLockAppealFiles.delete.1
            @Override // java.lang.Runnable
            public final void run() {
                CEV.A03(ModelLockAppealFiles.INSTANCE.getDir());
            }
        });
    }

    public final Object stage(ModelLockAppealFile modelLockAppealFile, Function0<Boolean> function0, HtJ<? super File> htJ) {
        return GAo.A00(htJ, serialDispatcher, new AnonymousClass2(function0, modelLockAppealFile, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getDir() {
        return C3cG.A0O(C4JM.A00().getCacheDir(), "shared/model_lock_appeal");
    }
}
