package com.topjohnwu.magisk.ui.flash

import com.topjohnwu.magisk.R
import com.topjohnwu.magisk.databinding.FragmentFlashMd2Binding
import com.topjohnwu.magisk.ui.base.CompatFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class FlashFragment : CompatFragment<FlashViewModel, FragmentFlashMd2Binding>() {

    override val layoutRes = R.layout.fragment_flash_md2
    override val viewModel by viewModel<FlashViewModel>()

}
