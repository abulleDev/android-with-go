package gomodule

import "fmt"

// Struct
type ExampleStruct struct {
	A int
	b int
	C *SubStruct
	D *struct {
		P int
		Q int
	}
}

type SubStruct struct {
	X int
	Y int
}

// Constructor
func NewExampleStruct(a, b, x, y, p, q int) *ExampleStruct {
	return &ExampleStruct{
		A: a,
		b: b,
		C: &SubStruct{X: x, Y: y},
		D: &struct {
			P int
			Q int
		}{
			P: p,
			Q: q,
		},
	}
}

// Getter
func (e *ExampleStruct) GetB() int {
	return e.b
}

// Setter
func (e *ExampleStruct) SetD(p, q int) {
	e.D.P = p
	e.D.Q = q
}

// toString
func (e *ExampleStruct) String() string {
	return fmt.Sprintf("ExampleStruct(A: %d, b: %d, C: (%d, %d), D: (%d, %d))", e.A, e.b, e.C.X, e.C.Y, e.D.P, e.D.Q)
}

// Method
func (e *ExampleStruct) AddAXP(da, dx, dp int) {
	e.A += da
	e.C.X += dx
	e.D.P += dp
}

var E = &ExampleStruct{
	A: 9,
	b: 8,
	C: &SubStruct{X: 7, Y: 6},
	D: &struct {
		P int
		Q int
	}{
		P: 5,
		Q: 4,
	},
}
