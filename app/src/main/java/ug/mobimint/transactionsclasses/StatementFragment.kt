package ug.mobimint.transactionsclasses

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ug.mobimint.R
import ug.mobimint.databinding.FragmentStatementBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StatementFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StatementFragment : Fragment() {
    private var _binding: FragmentStatementBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStatementBinding.inflate(inflater, container, false)
        return binding.root
    }
}