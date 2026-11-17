package com.facebook.aura.library.repo;

import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFI;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ThingsAndMediaDataSourceKt {
    public static final int PAGE_SIZE = 10;
    public static final String TAG = "ThingsAndMediaDataSource";
    public static final Set<String> IMAGE_EXTENSIONS = BFI.A0H(new String[]{"png", "jpg", "jpeg", "gif", "webp", "heic", "svg"});
    public static final Set<String> VIDEO_EXTENSIONS = C60O.A1B("mp4", "mov", "avi", "mkv");
    public static final Set<String> HIDDEN_DIRS = C60O.A19("__pycache__", "node_modules");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public static final boolean shouldHidePath(String str) {
        List listA0e = C7BY.A0e(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        if (!arrayListA0h.isEmpty()) {
            boolean zAreEqual = C7384Etj.areEqual(AbstractC0878AGe.A0G(arrayListA0h), "workspace");
            ArrayList arrayListA0Z = arrayListA0h;
            if (zAreEqual) {
                arrayListA0Z = AbstractC0878AGe.A0Z(arrayListA0h, 1);
            }
            if (!arrayListA0Z.isEmpty()) {
                if (!(arrayListA0Z instanceof Collection) || !arrayListA0Z.isEmpty()) {
                    Iterator it2 = arrayListA0Z.iterator();
                    while (it2.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it2);
                        if (AnonymousClass005.A1a(strA0j, ".") || HIDDEN_DIRS.contains(strA0j)) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final boolean isMediaEntry(WorkspaceEntry workspaceEntry) {
        return AbstractC0878AGe.A0k(IMAGE_EXTENSIONS, workspaceEntry.getFileExtension()) || AbstractC0878AGe.A0k(VIDEO_EXTENSIONS, workspaceEntry.getFileExtension());
    }

    public static final WorkspaceEntry libraryEntryToWorkspaceEntry(HatchFileOperations.LibraryEntry libraryEntry) {
        return new WorkspaceEntry(libraryEntry.name, WorkspaceEntry.EntryType.FILE, libraryEntry.getNormalizedPath(), libraryEntry.getSizeOrNull(), libraryEntry.getModifiedAtIso());
    }

    public static final String normalizePath(String str) {
        int iA0B = C7BY.A0B(str, "fs/raw/", 0, false);
        if (iA0B == -1) {
            return AnonymousClass005.A1a(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH) ? str.substring(1) : str;
        }
        String strSubstring = str.substring(iA0B + 7);
        return WorkspaceUriResolver.INSTANCE.decodeWorkspacePath(C7BY.A0S(strSubstring, strSubstring, '?'));
    }
}
