package software.highgravity.mindfulspender

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import software.highgravity.mindfulspender.databinding.FragmentSummaryBinding

class SummaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSummaryBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_summary, container, false)
        return binding.root
    }
}