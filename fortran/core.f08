module core
type node_t
  integer:: value
!  type(node_t), pointer,allocatable :: children(10);
!  type(node_t), allocatable :: children(10);
end type node_t
type(node_t) :: tree

contains 

function parse() result(res)
        res = 99999;
end function

function add_cc(cc,iso) result(res)
        character(30) :: cc
        character(3)  :: iso
        write (*,*) "adding ",cc,": ",iso
        res = 10000;
end function
end module
